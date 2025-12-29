package org.example.RateLimiter;

public class Main {

    public static void main(String[] args) {
        RateLimiterService service1 = new RateLimiterService(new TokenBucketStrategy());
        HTTPService service = new HTTPService(service1);
        Customer c1 = new Customer("Cisco", "1" , 100, 1000 );
        Customer c2 = new Customer("Cisco2", "2" ,200, 5000);
        Customer c3 = new Customer("Cisco3", "3", 100, 5000);
        for(int i=0;i<101;i++){
            boolean isSuccess = service.makeHttpRequest(c1);
            System.out.println("Is request allowed : " + isSuccess);
        }
    }
}
