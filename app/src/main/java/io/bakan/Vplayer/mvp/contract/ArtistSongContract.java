package io.bakan.Vplayer.mvp.contract;

import java.util.List;

import io.bakan.Vplayer.mvp.model.Song;
import io.bakan.Vplayer.mvp.presenter.BasePresenter;
import io.bakan.Vplayer.mvp.view.BaseView;

/**
 * Created by hefuyi on 2016/11/25.
 */

public interface ArtistSongContract {

    interface View extends BaseView {

        void showSongs(List<Song> songList);
    }

    interface Presenter extends BasePresenter<View> {

        void subscribe(long artistID);

        void loadSongs(long artistID);
    }

}
