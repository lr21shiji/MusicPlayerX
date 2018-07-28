package io.bakan.Vplayer.mvp.contract;

import android.content.Context;

import java.util.List;

import io.bakan.Vplayer.mvp.model.FolderInfo;
import io.bakan.Vplayer.mvp.presenter.BasePresenter;
import io.bakan.Vplayer.mvp.view.BaseView;

/**
 * Created by hefuyi on 2016/12/11.
 */

public interface FoldersContract {

    interface View extends BaseView{

        Context getContext();

        void showEmptyView();

        void showFolders(List<FolderInfo> folderInfos);
    }

    interface Presenter extends BasePresenter<View>{

        void loadFolders();
    }
}
