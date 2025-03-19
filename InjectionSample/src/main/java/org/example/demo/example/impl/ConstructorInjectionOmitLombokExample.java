package org.example.demo.example.impl;

import lombok.RequiredArgsConstructor;
import org.example.demo.example.Example;
import org.example.demo.service.SomeService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConstructorInjectionOmitLombokExample implements Example {
    /** 필드 */
    private final SomeService someService;

    // 생성자 생략 가능

    /** 실행 */
    @Override
    public void run() {
        someService.doService();
    }
}
