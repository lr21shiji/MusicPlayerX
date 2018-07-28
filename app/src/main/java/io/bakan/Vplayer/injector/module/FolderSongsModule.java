package io.bakan.Vplayer.injector.module;

import dagger.Module;
import dagger.Provides;
import io.bakan.Vplayer.mvp.contract.FolderSongsContract;
import io.bakan.Vplayer.mvp.presenter.FolderSongsPresenter;
import io.bakan.Vplayer.mvp.usecase.GetFolderSongs;
import io.bakan.Vplayer.respository.interfaces.Repository;

/**
 * Created by hefuyi on 2016/12/12.
 */
@Module
public class FolderSongsModule {

    @Provides
    GetFolderSongs getFolderSongsUsecase(Repository repository) {
        return new GetFolderSongs(repository);
    }

    @Provides
    FolderSongsContract.Presenter getFolderSongsPresenter(GetFolderSongs getFolderSongs) {
        return new FolderSongsPresenter(getFolderSongs);
    }
}
