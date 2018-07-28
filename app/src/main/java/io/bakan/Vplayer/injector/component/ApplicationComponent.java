package io.bakan.Vplayer.injector.component;

import android.app.Application;

import dagger.Component;
import io.bakan.Vplayer.ListenerApp;
import io.bakan.Vplayer.injector.module.ApplicationModule;
import io.bakan.Vplayer.injector.module.NetworkModule;
import io.bakan.Vplayer.injector.scope.PerApplication;
import io.bakan.Vplayer.respository.interfaces.Repository;

/**
 * Created by hefuyi on 2016/11/3.
 */
@PerApplication
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {

    Application application();

    ListenerApp listenerApplication();

    Repository repository();
}
