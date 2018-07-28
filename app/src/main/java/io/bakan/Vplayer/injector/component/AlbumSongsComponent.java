package io.bakan.Vplayer.injector.component;

import dagger.Component;
import io.bakan.Vplayer.injector.module.AlbumSongsModel;
import io.bakan.Vplayer.injector.scope.PerActivity;
import io.bakan.Vplayer.ui.fragment.AlbumDetailFragment;

/**
 * Created by hefuyi on 2016/12/3.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = AlbumSongsModel.class)
public interface AlbumSongsComponent {

    void inject(AlbumDetailFragment albumDetailFragment);

}
