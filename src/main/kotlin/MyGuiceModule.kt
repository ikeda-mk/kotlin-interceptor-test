package foo
import com.google.inject.AbstractModule
import com.google.inject.matcher.Matchers
import foo.FooService
import foo.FooServiceImpl
import foo.MyInterceptor

/**
 * Created by mak on 16/06/13.
 */
class MyGuiceModule: AbstractModule() {
    override fun configure() {
        this.bind(FooService::class.java).to( FooServiceImpl::class.java)
        this.bindInterceptor(Matchers.any(), Matchers.any(), MyInterceptor());
    }

}