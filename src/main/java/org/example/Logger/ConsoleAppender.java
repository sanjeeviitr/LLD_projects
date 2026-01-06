package org.example.Logger;

public class ConsoleAppender implements LogAppender{
    @Override
    public void append(Log log) {
        System.out.println("Append log to console " + log.getMessage());
    }
}
