package com.ewellhealth.sample.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@Api(tags = {"Special USER"})
public class HomeController {

    @ApiOperation(value = "欢迎信息", notes = "欢迎信息", httpMethod = "GET")
    @GetMapping("/")
    public Map<String, Object> greeting() {
        return Collections.singletonMap("message", "Hello World");
    }

}


