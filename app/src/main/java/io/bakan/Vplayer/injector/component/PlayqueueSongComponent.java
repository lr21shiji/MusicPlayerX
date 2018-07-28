package io.bakan.Vplayer.injector.component;

import dagger.Component;
import io.bakan.Vplayer.injector.module.PlayqueueSongModule;
import io.bakan.Vplayer.injector.scope.PerActivity;
import io.bakan.Vplayer.ui.dialogs.PlayqueueDialog;

/**
 * Created by hefuyi on 2016/12/27.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = PlayqueueSongModule.class)
public interface PlayqueueSongComponent {

    void inject(PlayqueueDialog playqueueDialog);
}
