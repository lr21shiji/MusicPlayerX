package io.bakan.Vplayer.injector.component;

import dagger.Component;
import io.bakan.Vplayer.injector.module.ArtistSongModule;
import io.bakan.Vplayer.injector.scope.PerActivity;
import io.bakan.Vplayer.ui.fragment.ArtistMusicFragment;

/**
 * Created by hefuyi on 2016/11/25.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ArtistSongModule.class)
public interface ArtistSongsComponent {

    void inject(ArtistMusicFragment artistMusicFragment);
}
