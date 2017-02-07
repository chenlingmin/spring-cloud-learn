package com.bb.spring.cloud.controller;

import com.bb.spring.cloud.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chenlm on 07/02/2017.
 */
@RestController
public class ConsumerControler {

    @Autowired
    ComputeService computeService;


    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }
}
