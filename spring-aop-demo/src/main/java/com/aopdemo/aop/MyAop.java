package com.aopdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {
    @Pointcut("execution(* com.aopdemo.*.*(..)) && @annotation(com.aopdemo.anno.MyAnno)")
    public void allPointCut() {
    }

    @Pointcut("execution(* com.aopdemo.web.*.*(..))")
    public void webPt(){
    }

    @Pointcut("@annotation(com.aopdemo.anno.MyAnno)")
    public void myAnno(){
    }


    @Before("myAnno()")
    public void before(JoinPoint joinPoint){
        System.out.println("myanno: 调用前...");
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getTarget());
    }

    @Around("webPt()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("webPt: 调用前...");
        Object result = point.proceed();
        System.out.println("webPt: 调用后...");
        return result;
    }

}
