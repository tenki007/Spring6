package com.hashtenki.anoaop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面类
@Aspect
@Component//ioc容器
public class LogAspect {
    //设置切入点和通知类型
    //通知类型：
    // 前置before、
    @Before(value = "pointCut()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("前置通知"+methodName);
    }
    // 后置after、
    // 返回after-returning、
    // 异常after-throwing、
    // 环绕around、
    @Pointcut(value = "execution(* com.hashtenki.anoaop.CalculatorImpl.*(..))")
    public void pointCut() {
    }
}
