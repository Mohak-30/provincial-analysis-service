package com.insee.pas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class ProvincialAnalysisServiceApplication {

    public static void main(String[] args) {
        log.debug("Starting Provincial analysis service");
        SpringApplication.run(ProvincialAnalysisServiceApplication.class, args);
        log.debug("Provincial analysis service started");
    }

}
