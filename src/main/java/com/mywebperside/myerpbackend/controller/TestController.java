package com.mywebperside.myerpbackend.controller;

import com.mywebperside.myerpbackend.models.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public BaseResponse<String> test() {
        return BaseResponse.success("Course ERP");
    }

}
