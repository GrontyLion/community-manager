package com.peaceforest.communitymanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CommunityManagerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new SpringApplicationBuilder(CommunityManagerApplication.class).headless(false).run(args);

    }

}
