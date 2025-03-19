package org.example.demo.example.impl;

import org.example.demo.example.Example;
import org.example.demo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class ConstructorInjectionOmitExample implements Example {
    /** 필드 */
    private final SomeService someService;

    /** 생성자 주입 */
    @Autowired
    public ConstructorInjectionOmitExample(SomeService someService) {
        this.someService = someService;
    }

    @Override
    public void run() {
        someService.doService();
    }
}
