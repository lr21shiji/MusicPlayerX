package io.bakan.Vplayer.mvp.contract;

import java.util.List;

import io.bakan.Vplayer.mvp.model.Playlist;
import io.bakan.Vplayer.mvp.presenter.BasePresenter;
import io.bakan.Vplayer.mvp.view.BaseView;

/**
 * Created by hefuyi on 2016/12/4.
 */

public interface PlaylistContract {

    interface View extends BaseView{

        void showPlaylist(List<Playlist> playlists);

        void showEmptyView();

    }

    interface Presenter extends BasePresenter<View>{

        void loadPlaylist();
    }
}
