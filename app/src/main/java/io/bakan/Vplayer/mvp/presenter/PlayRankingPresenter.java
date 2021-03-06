package io.bakan.Vplayer.mvp.presenter;

import java.util.List;

import io.bakan.Vplayer.Constants;
import io.bakan.Vplayer.mvp.contract.PlayRankingContract;
import io.bakan.Vplayer.mvp.model.Song;
import io.bakan.Vplayer.mvp.usecase.GetSongs;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by hefuyi on 2016/12/9.
 */

public class PlayRankingPresenter implements PlayRankingContract.Presenter {

    private GetSongs mUsecase;
    private PlayRankingContract.View mView;
    private CompositeSubscription mCompositeSubscription;

    public PlayRankingPresenter(GetSongs getSongs) {
        mUsecase = getSongs;
    }

    @Override
    public void attachView(PlayRankingContract.View view) {
        mView = view;
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void subscribe() {
        loadRanking();
    }

    @Override
    public void unsubscribe() {
        mCompositeSubscription.clear();
    }

    @Override
    public void loadRanking() {
        mCompositeSubscription.clear();
        Subscription subscription = mUsecase.execute(new GetSongs.RequestValues(Constants.NAVIGATE_PLAYLIST_TOPPLAYED))
                .getSongList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<Song>>() {
                    @Override
                    public void call(List<Song> songList) {
                        if (songList == null || songList.size() == 0) {
                            mView.showEmptyView();
                        } else {
                            mView.showRanking(songList);
                        }
                    }
                });
        mCompositeSubscription.add(subscription);
    }
}
