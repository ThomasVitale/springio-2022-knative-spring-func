package com.thomasvitale.webfunction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@SpringBootApplication
public class WebFunctionApplication {

    private static final Logger log = LoggerFactory.getLogger(WebFunctionApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebFunctionApplication.class, args);
    }

    // "piano" => "PIANO" => "I play the PIANO"

    @Bean
    Function<String,String> uppercase() {
        return instrument -> {
            log.info("Converting {} to uppercase", instrument);
            return instrument.toUpperCase();
        };
    }

    @Bean
    Function<Mono<String>,Mono<String>> sentence() {
        return mono -> mono.map(instrument -> {
            log.info("Building sentence for {}", instrument);
            return "I play the " + instrument;
        });
    }

}
