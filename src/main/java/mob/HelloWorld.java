package mob;

import com.google.inject.Guice;
import com.google.inject.Injector;
import foo.FooService;
import foo.FooServiceImpl;

/**
 * Created by mak on 16/06/12.
 */
public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello");

        FooService service = new FooServiceImpl();
        service.hello();

        Injector injector = Guice.createInjector(new MobServiceModule());
        MobService mob = injector.getInstance(MobService.class);

        mob.hello();


    }
}
