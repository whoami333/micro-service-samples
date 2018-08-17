package com.ewellhealth.consul.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ProducerController {
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/producer")
    public String myProducer(){
        return "Producer uri " + request.getRequestURL();
    }
}
