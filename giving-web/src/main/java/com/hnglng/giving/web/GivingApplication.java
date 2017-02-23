package com.hnglng.giving.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Bright Huang on 1/8/17.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class GivingApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(GivingApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GivingApplication.class);
    }

}
