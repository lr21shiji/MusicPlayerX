package io.bakan.Vplayer.injector.component;

import dagger.Component;
import io.bakan.Vplayer.injector.module.ArtistInfoModule;
import io.bakan.Vplayer.injector.scope.PerActivity;
import io.bakan.Vplayer.ui.adapter.ArtistAdapter;
import io.bakan.Vplayer.ui.fragment.ArtistDetailFragment;

/**
 * Created by hefuyi on 2016/11/13.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ArtistInfoModule.class)
public interface ArtistInfoComponent {

    void injectForAdapter(ArtistAdapter artistAdapter);

    void injectForFragment(ArtistDetailFragment fragment);
}
