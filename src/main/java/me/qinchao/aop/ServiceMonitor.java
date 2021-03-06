package me.qinchao.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 16-6-14.
 */
@Aspect
@Component
public class ServiceMonitor {
    private final static Logger LOGGER = LoggerFactory.getLogger(ServiceMonitor.class);

    @Around("execution(* me.qinchao..*Service.*(..))")
    Object serviceAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("Service::" + proceedingJoinPoint.getTarget().getClass().getName()
                + "  Method::" + proceedingJoinPoint.getSignature().getName());
        return proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
    }
    
    @Around("execution(* me.qinchao.service.HelloWorldService.*(..))")
    Object helloWorldServiceAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("HelloWorldService::" + proceedingJoinPoint.getTarget().getClass().getName()
                + "  Method::" + proceedingJoinPoint.getSignature().getName());
        return proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
    }
}
