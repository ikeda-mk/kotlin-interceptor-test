package foo.annotation

/**
 * Created by mak on 16/06/13.
 */

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
public annotation class Tracelog