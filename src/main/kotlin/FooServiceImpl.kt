package foo

import foo.annotation.Tracelog

/**
 * Created by mak on 16/06/13.
 */
open class FooServiceImpl : FooService{


    @Tracelog
    override fun hello() {
        println("hello")
    }

    override fun world() {
        println("world")
    }

}