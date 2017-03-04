package com.hnglng.giving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Bright Huang on 1/8/17.
 */
@SpringBootApplication
public class GivingApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(GivingApplication.class, args);
    }
}
