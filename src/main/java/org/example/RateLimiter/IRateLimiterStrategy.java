package org.example.RateLimiter;

public interface IRateLimiterStrategy{

    boolean allowRequest(Customer customer);
}
