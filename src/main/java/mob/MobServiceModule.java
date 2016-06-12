package mob;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 * Created by mak on 16/06/13.
 */
public class MobServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        this.bind(MobService.class).to(MobServiceImpl.class);
        this.bindInterceptor(Matchers.any(), Matchers.any(), new MobServiceInterceptor());
    }
}
