package org.example.RateLimiter;

public class RateLimiterService {

    private final IRateLimiterStrategy strategy;
    public RateLimiterService(IRateLimiterStrategy strategy){
        this.strategy = strategy;
    }

    public boolean allowRequest(Customer customer){
        return this.strategy.allowRequest(customer);
    }

}
