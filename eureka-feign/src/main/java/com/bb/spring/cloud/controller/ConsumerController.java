package com.bb.spring.cloud.controller;

import com.bb.spring.cloud.client.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chenlm on 07/02/2017.
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    private Integer add() {
        return computeClient.add(10, 20);
    }
}
