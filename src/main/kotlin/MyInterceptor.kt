package foo

import org.aopalliance.intercept.MethodInterceptor
import org.aopalliance.intercept.MethodInvocation

/**
 * Created by mak on 16/06/13.
 */
class MyInterceptor : MethodInterceptor {
    override fun invoke(invocation: MethodInvocation?): Any? {
        val methodName: String = invocation!!.getMethod().getName();

        val start = System.currentTimeMillis()
        val result = invocation.proceed()
        val end = System.currentTimeMillis()

        System.out.println(methodName + ": " + (end - start) + "ms");

        return result;
    }
}