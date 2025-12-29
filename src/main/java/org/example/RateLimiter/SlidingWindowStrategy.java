package org.example.RateLimiter;

public class SlidingWindowStrategy implements IRateLimiterStrategy{
    @Override
    public boolean allowRequest(Customer customer) {
        return false;
    }
}
