package org.example.demo.example.impl;

import org.example.demo.example.Example;
import org.example.demo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class FieldInjectionExample implements Example {

    /** 필드 주입 */
    @Autowired
    private SomeService someService;

    /** 실행 */
    @Override
    public void run() {
        someService.doService();
    }
}
