import foo.FooFacade
import foo.FooService
import foo.FooServiceImpl

/**
 * Created by mak on 16/06/12.
 */

fun main(args: Array<String>) {
    println("Hello, world!")
    FooFacade().hello()
    val service: FooService = FooServiceImpl()
    service.hello()
    service.world()
}
