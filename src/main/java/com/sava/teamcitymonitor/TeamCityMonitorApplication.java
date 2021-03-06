package com.sava.teamcitymonitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class TeamCityMonitorApplication extends SpringBootServletInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(TeamCityMonitorApplication.class);

    @Value("${teamcity.host}")
    String host;

    public static void main(String[] args) {
        SpringApplication.run(TeamCityMonitorApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(Environment environment) {
        return args -> LOGGER.info("message from application.properties " + host);
    }
}
