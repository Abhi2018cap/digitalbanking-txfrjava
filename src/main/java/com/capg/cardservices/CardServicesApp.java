package com.capg.cardservices;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sujillel
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class CardServicesApp {

	 private static Logger log = Logger.getLogger(CardServicesApp.class);
    public static void main(String[] args) {
    	log.info("Entering Main logger enabled");
        SpringApplication.run(CardServicesApp.class, args);
    }
}

