package com.ewellhealth.consul.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConsumerController {
    @Autowired
    private ConsulDiscoveryClient consulDiscoveryClient;

    @RequestMapping("/consumer/instances")
    public List<String> myConsumer() {
        List<String> result = new ArrayList<>();
        List<ServiceInstance> services = consulDiscoveryClient.getInstances("business1-consul-producer");
        for (ServiceInstance instance : services) {
            result.add(instance.getUri().toString());
        }
        return result;
    }

    @RequestMapping("/consumer/random")
    public String randomConsulResult() {
        return "";
    }
}
