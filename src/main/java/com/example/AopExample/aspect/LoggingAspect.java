package com.example.AopExample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.aopdemo.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("AOP Log → Method called: " + joinPoint.getSignature());
    }
}
