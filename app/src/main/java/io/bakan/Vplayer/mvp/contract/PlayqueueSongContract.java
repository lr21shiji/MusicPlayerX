package io.bakan.Vplayer.mvp.contract;

import android.content.Context;

import java.util.List;

import io.bakan.Vplayer.mvp.model.Song;
import io.bakan.Vplayer.mvp.presenter.BasePresenter;
import io.bakan.Vplayer.mvp.view.BaseView;

/**
 * Created by hefuyi on 2016/12/27.
 */

public interface PlayqueueSongContract {

    interface View extends BaseView{

        Context getContext();

        void showSongs(List<Song> songs);

    }

    interface Presenter extends BasePresenter<View>{

        void loadSongs();
    }
}
