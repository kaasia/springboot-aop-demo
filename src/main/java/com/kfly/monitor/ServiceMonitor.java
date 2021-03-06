package com.kfly.monitor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Kfly on 2016/4/20.
 */
@Aspect
@Component
public class ServiceMonitor {
    @After("execution(* com.kfly.service.HelloWorldService.getHelloMessage(..))")
    public void logServiceAccess(JoinPoint joinPoint){
        System.out.println("completed:"+joinPoint);
    }

}
