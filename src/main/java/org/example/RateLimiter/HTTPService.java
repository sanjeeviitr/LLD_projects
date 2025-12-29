package org.example.RateLimiter;

public class HTTPService {
    RateLimiterService service;

    public HTTPService(RateLimiterService service){
        this.service= service;
    }
   public boolean makeHttpRequest(Customer customer){
       return this.service.allowRequest(customer);
   }
}
