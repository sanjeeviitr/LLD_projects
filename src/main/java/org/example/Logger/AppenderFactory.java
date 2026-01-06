package org.example.Logger;

public class AppenderFactory {

    public LogAppender getAppender(AppenderType type){
        switch (type){
            case DB -> {
                return new DBAppender();
            }
            case FILE -> {
                return new FileAppender();
            }
            case CONSOLE -> {
                return  new ConsoleAppender();
            }
        }
        throw new IllegalArgumentException("Unknown appender type");
    }
}
