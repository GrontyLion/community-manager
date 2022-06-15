package com.peaceforest.communitymanager.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Data
@ConfigurationProperties(prefix = "swing")
public class SwingConfig {

    @Value("${swing.default.theme.name}")
    private String defaultTheme;

    private Map<String, String> themes;

}
