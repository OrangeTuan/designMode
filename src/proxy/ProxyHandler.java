package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object proxyObj;

    public ProxyHandler(Object proxyObj) {
        this.proxyObj = proxyObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(proxyObj, args);
        return null;
    }
}
