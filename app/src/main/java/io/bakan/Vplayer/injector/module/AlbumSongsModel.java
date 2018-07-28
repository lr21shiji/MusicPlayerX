package io.bakan.Vplayer.injector.module;

import dagger.Module;
import dagger.Provides;
import io.bakan.Vplayer.mvp.contract.AlbumDetailContract;
import io.bakan.Vplayer.mvp.presenter.AlbumDetailPresenter;
import io.bakan.Vplayer.mvp.usecase.GetAlbumSongs;
import io.bakan.Vplayer.respository.interfaces.Repository;

/**
 * Created by hefuyi on 2016/12/3.
 */
@Module
public class AlbumSongsModel {

    @Provides
    GetAlbumSongs getAlbumSongUsecase(Repository repository) {
        return new GetAlbumSongs(repository);
    }

    @Provides
    AlbumDetailContract.Presenter getAlbumDetailPresenter(GetAlbumSongs getAlbumSongs) {
        return new AlbumDetailPresenter(getAlbumSongs);
    }
}
