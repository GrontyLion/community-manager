package com.peaceforest.communitymanager;

import com.peaceforest.communitymanager.app.Application;
import com.peaceforest.communitymanager.common.ThemeManager;
import com.peaceforest.communitymanager.config.SwingConfig;
import com.peaceforest.communitymanager.view.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class CommunityManagerApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(CommunityManagerApplication.class).headless(false).run(args);
        Application application = applicationContext.getBean(Application.class);
        application.run();
    }

}
