package io.bakan.Vplayer.injector.module;

import dagger.Module;
import dagger.Provides;
import io.bakan.Vplayer.mvp.contract.ArtistSongContract;
import io.bakan.Vplayer.mvp.presenter.ArtistSongPresenter;
import io.bakan.Vplayer.mvp.usecase.GetArtistSongs;
import io.bakan.Vplayer.respository.interfaces.Repository;

/**
 * Created by hefuyi on 2016/11/25.
 */
@Module
public class ArtistSongModule {

    @Provides
    GetArtistSongs getArtistSongsUsecase(Repository repository) {
        return new GetArtistSongs(repository);
    }

    @Provides
    ArtistSongContract.Presenter getArtistSongPresenter(GetArtistSongs getArtistSongs) {
        return new ArtistSongPresenter(getArtistSongs);
    }
}
