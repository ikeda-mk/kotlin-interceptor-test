package foo
import com.google.inject.AbstractModule
import com.google.inject.matcher.Matchers
import foo.annotation.Tracelog

/**
 * Created by mak on 16/06/13.
 */
class FooServiceModule : AbstractModule() {
    override fun configure() {
        this.bind(FooService::class.java).to( FooServiceImpl::class.java)
        this.bindInterceptor(Matchers.any(), Matchers.annotatedWith(Tracelog::class.java), FooServiceInterceptor())
    }

}