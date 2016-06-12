import com.google.inject.Guice
import foo.FooService
import foo.FooServiceModule

/**
 * Created by mak on 16/06/12.
 */

fun main(args: Array<String>) {


    val injector = Guice.createInjector(FooServiceModule());
    val service: FooService = injector.getInstance(FooService::class.java)

    service.hello()
    service.world()
}
