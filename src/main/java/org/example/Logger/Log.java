package org.example.Logger;

public class Log {

    private String message;
    private LogLevel level;

    public Log(LogLevel level, String message){
        this.level = level;
        this.message = message;
    }

    public LogLevel getLevel(){
        return level;
    }

    public String getMessage(){
        return message;
    }
}
