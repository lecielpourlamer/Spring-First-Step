package org.example.demo.service.impl;

import org.example.demo.service.BusinessLogic;

public class TestLogicImpl implements BusinessLogic {
    @Override
    public void doLogic() {
        System.out.println("테스트 중입니다.");
    }
}
