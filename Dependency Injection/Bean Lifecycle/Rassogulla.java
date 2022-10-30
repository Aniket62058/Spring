package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Rassogulla {
    private int price;

    public Rassogulla(){

    }

    public Rassogulla(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Rassogulla{" +
                "price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @PostConstruct
    public void start(){
        System.out.println("Buying Rassogulla : init-Rassogula ");
    }

    @PreDestroy
    public void end(){
        System.out.println("Khatam Tata Bye Bye : destroy-Rassogulla");
    }
}
