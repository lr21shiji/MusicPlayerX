package io.bakan.Vplayer.mvp.contract;

import java.util.List;

import io.bakan.Vplayer.mvp.model.Song;
import io.bakan.Vplayer.mvp.presenter.BasePresenter;
import io.bakan.Vplayer.mvp.view.BaseView;

/**
 * Created by hefuyi on 2016/12/12.
 */

public interface FolderSongsContract {

    interface View extends BaseView{

        void showSongs(List<Song> songList);

    }

    interface Presenter extends BasePresenter<View>{

        void loadSongs(String path);

    }
}
