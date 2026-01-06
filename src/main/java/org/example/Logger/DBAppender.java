package org.example.Logger;

public class DBAppender implements LogAppender{

    @Override
    public void append(Log log) {
        System.out.println("Appending log to DB " + log.getMessage());
    }
}
