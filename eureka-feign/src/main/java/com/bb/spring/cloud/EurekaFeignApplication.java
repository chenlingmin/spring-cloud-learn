package com.bb.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Chenlm on 07/02/2017.
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EurekaFeignApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaFeignApplication.class).web(true).run(args);
    }
}
