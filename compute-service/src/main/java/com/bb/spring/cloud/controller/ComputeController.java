package com.bb.spring.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chenlm on 07/02/2017.
 */
@Slf4j
@RestController
public class ComputeController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(
            @RequestParam Integer a,
            @RequestParam Integer b
    ) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        log.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return r;
    }
}
