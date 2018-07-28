package io.bakan.Vplayer.injector.module;

import dagger.Module;
import dagger.Provides;
import io.bakan.Vplayer.mvp.contract.SearchContract;
import io.bakan.Vplayer.mvp.presenter.SearchPresenter;
import io.bakan.Vplayer.mvp.usecase.GetSearchResult;
import io.bakan.Vplayer.respository.interfaces.Repository;

/**
 * Created by hefuyi on 2017/1/3.
 */
@Module
public class SearchModule {

    @Provides
    SearchContract.Presenter getSearchPresenter(GetSearchResult getSearchResult) {
        return new SearchPresenter(getSearchResult);
    }

    @Provides
    GetSearchResult getSearchResultUsecase(Repository repository) {
        return new GetSearchResult(repository);
    }
}
