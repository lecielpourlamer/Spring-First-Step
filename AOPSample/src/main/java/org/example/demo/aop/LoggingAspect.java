package org.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Aspect
@Component
public class LoggingAspect {

    //@Before("execution(* org.example.demo.service.TargetService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        LocalDateTime startTime = LocalDateTime.now();
        String formattedTime = startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS:SSS"));
        System.out.println("-------⟬@Before⟭-------");
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("메서드 시작: " + formattedTime);
    }

    //@After("execution(* org.example.demo.service.TargetService.*(..))")
    public void AfterAdvice(JoinPoint joinPoint) {
        LocalDateTime endTime = LocalDateTime.now();    // 현재 날짜 및 시간 가져오기
        String formattedTime = endTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
        System.out.println("-------⟬@After⟭-------");
        System.out.println("After method: " + joinPoint.getSignature());
        System.out.println("메서드 종료: " + formattedTime);
    }

    @Around("execution(* org.example.demo.service.TargetService.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("=====⟬@Around: 전⟭=====");
        System.out.println("▮Target");
        System.out.println(" 클래스:" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println(" 메서드:" + joinPoint.getSignature().getName());

        Object result = joinPoint.proceed();    // 실행 메서드 호출

        System.out.println("=====⟬@Around: 후⟭=====");
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("메서드 실행 시간: " + elapsedTime + " milliseconds");
        return result;
    }
}
