package pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
    代理模式
 */
public class DynamicProxy implements InvocationHandler{
    private Object object;

    public DynamicProxy(Object obj){
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        if(method.getName().equals("buy")){
            System.out.println("mai");
        }
        return result;
    }

    public static void main(String[] args) {
        Ibuy awei = new Awei();
        DynamicProxy dynamicProxy = new DynamicProxy(awei);
        ClassLoader loader = awei.getClass().getClassLoader();
        Ibuy proxy = (Ibuy)Proxy.newProxyInstance(loader, new Class[]{Ibuy.class}, dynamicProxy);
        proxy.buy("");
    }
}
