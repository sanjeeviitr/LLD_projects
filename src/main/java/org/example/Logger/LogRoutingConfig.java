package org.example.Logger;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class LogRoutingConfig {

    private final Map<LogLevel, AppenderType> routingMap = new HashMap<>();

    public LogRoutingConfig(){
        load();
    }

    private void load(){
        Properties props = new Properties();
        try (InputStream is =
                     getClass().getClassLoader().getResourceAsStream("log-routing.properties")) {

            props.load(is);
            if (is == null) {
                throw new RuntimeException("log-routing.properties not found in classpath");
            }

            for(String key : props.stringPropertyNames()){
                LogLevel level = LogLevel.valueOf(key);
                AppenderType type = AppenderType.valueOf(props.getProperty(key));
                routingMap.put(level, type);
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to load log routing config", e);
        }
    }

    public AppenderType getAppenderType(LogLevel level) {
        AppenderType type = routingMap.get(level);
        if (level == null) {
            throw new RuntimeException("No appender configured for level : " + level);
        }
        return routingMap.get(level);
    }
}
