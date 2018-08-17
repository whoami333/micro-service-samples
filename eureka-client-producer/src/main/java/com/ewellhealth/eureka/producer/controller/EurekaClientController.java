package com.ewellhealth.eureka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EurekaClientController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/eureka", method = RequestMethod.GET)
    public String eurekaInfo() {
        List<ServiceInstance> services = client.getInstances("eureka-producer");
        StringBuilder stringBuilder = new StringBuilder();
        for (ServiceInstance service : services) {
            stringBuilder.append(service.getUri() + "/" + service.getPort() + ",");
        }
        return "Hello spring:" + stringBuilder.toString();
    }
}
