package org.example.RateLimiter;

public class HourlyAllowStrategy implements IRateLimiterStrategy{
    @Override
    public boolean allowRequest(Customer key) {
        return false;
    }
}
