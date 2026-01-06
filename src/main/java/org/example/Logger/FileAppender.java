package org.example.Logger;

public class FileAppender implements LogAppender{
    @Override
    public void append(Log log) {
        System.out.println("Append log to file " + log.getMessage());
    }
}
