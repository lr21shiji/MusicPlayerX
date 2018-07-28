package io.bakan.Vplayer.mvp.contract;

import java.util.List;

import io.bakan.Vplayer.mvp.model.Artist;
import io.bakan.Vplayer.mvp.presenter.BasePresenter;
import io.bakan.Vplayer.mvp.view.BaseView;

/**
 * Created by hefuyi on 2016/11/13.
 */

public interface ArtistContract {

    interface View extends BaseView{

        void showArtists(List<Artist> artists);

        void showEmptyView();
    }

    interface Presenter extends BasePresenter<View>{

        void loadArtists(String action);
    }
}
