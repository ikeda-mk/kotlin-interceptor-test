package foo.annotation

/**
 * Created by mak on 16/06/13.
 */

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
public annotation class Tracelog