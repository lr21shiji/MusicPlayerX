package io.bakan.Vplayer.injector.component;

import dagger.Component;
import io.bakan.Vplayer.injector.module.ActivityModule;
import io.bakan.Vplayer.injector.module.SongsModule;
import io.bakan.Vplayer.injector.scope.PerActivity;
import io.bakan.Vplayer.ui.fragment.SongsFragment;

/**
 * Created by hefuyi on 2016/11/12.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, SongsModule.class})
public interface SongsComponent {

    void inject(SongsFragment songsFragment);
}
