package io.bakan.Vplayer.mvp.contract;

import java.util.List;

import io.bakan.Vplayer.mvp.model.Album;
import io.bakan.Vplayer.mvp.presenter.BasePresenter;
import io.bakan.Vplayer.mvp.view.BaseView;

/**
 * Created by hefuyi on 2016/11/12.
 */

public interface AlbumsContract {

    interface View extends BaseView{

        void showAlbums(List<Album> albumList);

        void showEmptyView();
    }

    interface Presenter extends BasePresenter<View>{

        void loadAlbums(String action);

    }
}
