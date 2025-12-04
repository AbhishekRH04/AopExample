package com.example.AopExample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.example.AopExample.service.*.*(..))")
    public void serviceMethods(){}
    @Before("serviceMethods()")
    public void beforeMethod(JoinPoint jp)
    {
        System.out.println("before method: "+ jp.getSignature().getName());
    }
    // After Advice
    @After("serviceMethods()")
    public void afterMethod(JoinPoint jp) {
        System.out.println("After method: " + jp.getSignature().getName());
    }
    // After Throwing Advice
    @AfterThrowing("serviceMethods()")
    public void afterException(JoinPoint jp) {
        System.out.println("Exception occurred in method: " + jp.getSignature().getName());
    }
}
