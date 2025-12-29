package org.example.RateLimiter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TokenBucketStrategy implements IRateLimiterStrategy{


    private final Map<String, TokenBucket> bucketMap;

    public TokenBucketStrategy(){
        this.bucketMap = new ConcurrentHashMap<>();
    }

    @Override
    public synchronized boolean allowRequest(Customer customer) {
        if(customer == null || customer.getId() == null){
            System.out.println("Customer details not be null");
            return false;
        }
        TokenBucket bucket = bucketMap.computeIfAbsent(
                customer.getId(),
                id -> new TokenBucket(customer.getCapacity(), customer.getFillRate())
        );

        return bucket.allowRequest();
    }
}
