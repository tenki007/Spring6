package com.hashtenki;

import com.hashtenki.bean.Calculator;
import com.hashtenki.bean.CalculatorImpl;
import com.hashtenki.bean.ProxyFactory;
import org.junit.jupiter.api.Test;

public class Testcl {
    @Test
    public void test()
    {
        CalculatorImpl calculator = new CalculatorImpl();
        ProxyFactory proxyFactory = new ProxyFactory(calculator);
        Calculator proxy = (Calculator) proxyFactory.getProxyInstance();
        int result = proxy.add(1, 2);
        System.out.println(result);
    }
}
