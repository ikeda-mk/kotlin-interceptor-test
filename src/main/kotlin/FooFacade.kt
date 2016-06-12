package foo
import com.google.inject.Guice

/**
 * Created by mak on 16/06/13.
 */
class FooFacade {
    fun hello() {
        val injector = Guice.createInjector(MyGuiceModule());
        val service: FooService = injector.getInstance(FooService::class.java)

        service.hello()
    }

}