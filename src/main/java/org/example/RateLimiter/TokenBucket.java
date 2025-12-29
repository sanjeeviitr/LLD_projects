package org.example.RateLimiter;

import java.time.Duration;
import java.time.LocalDateTime;

public class TokenBucket {

    private double capacity;
    private LocalDateTime lastFillTime;
    private double fillRate;
    private double tokens;

    public TokenBucket(double capacity, double fillRate) {
        this.capacity = capacity;
        this.fillRate = fillRate;
        this.tokens = capacity;
        this.lastFillTime = LocalDateTime.now();
    }

    private void refillTokens() {
        LocalDateTime currentTime = LocalDateTime.now();
        double secondsLapsed = Math.abs(Duration.between(lastFillTime, currentTime).toSeconds());
        tokens += (secondsLapsed / 3600) * fillRate;
        tokens = Math.min(tokens, capacity);
        lastFillTime = currentTime;
    }

    public synchronized boolean allowRequest(){
        refillTokens();
        if(tokens > 0){
            tokens --;
            return true;
        }
        return false;
    }
}
