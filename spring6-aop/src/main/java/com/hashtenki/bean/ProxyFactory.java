package com.hashtenki.bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable {
            System.out.println("开始事务...");
            Object returnValue = method.invoke(target, args);
            System.out.println("提交事务...");
            return returnValue;
            }
        });
    }
}
