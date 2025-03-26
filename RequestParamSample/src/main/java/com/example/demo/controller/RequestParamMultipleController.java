package com.example.demo.controller;

import com.example.demo.form.SampleForm;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Controller
public class RequestParamMultipleController {

    // GET 및 URL(/multiple)
    @GetMapping("multiple")
    public String showView() {
        // 반환값으로 뷰 이름을 반환
        return "entry";
    }

    // POST 및 URL(/confirm)
//    @PostMapping("confirm")
//    public String confirmView(Model model,
//                              @RequestParam String name,
//                              @RequestParam Integer age,
//                              @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam Date birth) {
//        LocalDate birthLocalDate = birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//        // Model에 저장
//        model.addAttribute("name", name);
//        model.addAttribute("age", age);
//        model.addAttribute("birth", birthLocalDate);
//
//        // 반환값으로 뷰 이름을 반환
//        return "confirm";
//    }

    // POST 및 URL(/confirm)
    @PostMapping("confirm")
    public String confirmView(SampleForm form) {
        // 반환값으로 뷰 이름을 반환
        return "confirm2";
    }








}
