package foo

import org.aopalliance.intercept.MethodInterceptor
import org.aopalliance.intercept.MethodInvocation

/**
 * Created by mak on 16/06/13.
 */
class FooServiceInterceptor : MethodInterceptor {
    override fun invoke(invocation: MethodInvocation?): Any? {
        val methodName: String = invocation!!.getMethod().getName();

        val start = System.currentTimeMillis()
        println("pre execute.")
        val result = invocation.proceed()
        val end = System.currentTimeMillis()
        println(methodName + ": " + (end - start) + "ms");
        println("post execute.")

        return result;
    }
}