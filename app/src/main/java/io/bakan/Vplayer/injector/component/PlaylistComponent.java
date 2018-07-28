package io.bakan.Vplayer.injector.component;

import dagger.Component;
import io.bakan.Vplayer.injector.module.PlaylistModule;
import io.bakan.Vplayer.injector.scope.PerActivity;
import io.bakan.Vplayer.ui.fragment.PlaylistFragment;

/**
 * Created by hefuyi on 2016/12/5.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = PlaylistModule.class)
public interface PlaylistComponent {

    void inject(PlaylistFragment playlistFragment);
}
