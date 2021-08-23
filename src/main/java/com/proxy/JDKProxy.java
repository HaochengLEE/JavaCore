package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * * @author lihaocheng
 * * @createtime 2021/5/23
 */
public class JDKProxy {
    static interface IService{
        public void hello();
    }

    static class RelService implements IService{

        @Override
        public void hello() {
            System.out.println("hello");
        }
    }

    static class SimpleInvocationHandler implements InvocationHandler{
        private Object object;
        public SimpleInvocationHandler(Object o){
            this.object=o;
        }
        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            Object result=method.invoke(object,objects);
            return result;
        }
    }

    public static void main(String[] args) {
        IService relService=new RelService();
        IService proxyService=(IService) Proxy.newProxyInstance(
                IService.class.getClassLoader(),new Class<?>[]{IService.class},new SimpleInvocationHandler(relService)
        );
        proxyService.hello();
    }
}
