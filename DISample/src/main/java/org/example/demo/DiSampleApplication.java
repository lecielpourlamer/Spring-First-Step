package org.example.demo;

import org.example.demo.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 스프링 부트 시작 클래스
 */
@SpringBootApplication
public class DiSampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiSampleApplication.class, args)
                .getBean(DiSampleApplication.class).execute();
    }

    /** 주입되는 부분(인터페이스) */
    @Autowired
    private Greet g;

    /**
     * 실행
     */
    private void execute() {
        String msg = g.greeting();
        System.out.println("msg = " + msg);
    }
}
