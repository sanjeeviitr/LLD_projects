package org.example.RateLimiter;

public class Customer {

    private String name;
    private String id;
    private double capacity;
    private double fillRate;

    public Customer(String name, String id, double capacity, double fillRate){
        this.name = name;
        this.capacity = capacity;
        this.id = id;
        this.fillRate = fillRate;
    }

    public String getId(){
        return id;
    }

    public double getCapacity(){
        return capacity;
    }

    public double getFillRate(){
        return fillRate;
    }
}
