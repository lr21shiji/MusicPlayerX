package io.bakan.Vplayer.injector.module;

import dagger.Module;
import dagger.Provides;
import io.bakan.Vplayer.mvp.contract.ArtistDetailContract;
import io.bakan.Vplayer.mvp.presenter.ArtistDetailPresenter;
import io.bakan.Vplayer.mvp.usecase.GetArtistInfo;
import io.bakan.Vplayer.respository.interfaces.Repository;

/**
 * Created by hefuyi on 2016/11/13.
 */
@Module
public class ArtistInfoModule {

    @Provides
    GetArtistInfo getArtistInfoUsecase(Repository repository) {
        return new GetArtistInfo(repository);
    }

    @Provides
    ArtistDetailContract.Presenter getArtistDetailPresenter() {
        return new ArtistDetailPresenter();
    }
}
