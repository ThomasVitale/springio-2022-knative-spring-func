package com.thomasvitale.webfunction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebFunctionApplication {

    private static final Logger log = LoggerFactory.getLogger(WebFunctionApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebFunctionApplication.class, args);
    }

}
