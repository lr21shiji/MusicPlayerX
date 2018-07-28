package io.bakan.Vplayer.injector.module;

import dagger.Module;
import dagger.Provides;
import io.bakan.Vplayer.mvp.contract.ArtistContract;
import io.bakan.Vplayer.mvp.presenter.ArtistPresenter;
import io.bakan.Vplayer.mvp.usecase.GetArtists;
import io.bakan.Vplayer.respository.interfaces.Repository;

/**
 * Created by hefuyi on 2016/11/13.
 */
@Module
public class ArtistsModule {

    @Provides
    ArtistContract.Presenter getArtistPresenter(GetArtists getArtists) {
        return new ArtistPresenter(getArtists);
    }

    @Provides
    GetArtists getArtistsUsecase(Repository repository) {
        return new GetArtists(repository);
    }
}
