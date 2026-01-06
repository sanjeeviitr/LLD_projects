package org.example.Logger;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Logger {


    private final AppenderFactory appenderFactory = new AppenderFactory();
    private final LogRoutingConfig config = new LogRoutingConfig();

    private void dispatch(Log log) {
       AppenderType appenderType = config.getAppenderType(log.getLevel());
       LogAppender appender = appenderFactory.getAppender(appenderType);
       appender.append(log);
    }

    public void info(String message) {
        Log log = new Log(LogLevel.INFO, message);
        dispatch(log);
    }

    public void debug(String message) {
        Log log = new Log(LogLevel.DEBUG, message);
        dispatch(log);
    }

    public void error(String message) {
        Log log= new Log(LogLevel.ERROR, message);
        dispatch(log);
    }
}
