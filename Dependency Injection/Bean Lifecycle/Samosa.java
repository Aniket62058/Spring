package com.lifecycle;

public class Samosa {
    private int price;

    public Samosa(){

    }

    public Samosa(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Initializing Method : Samosa");
    }

    public void destroy(){
        System.out.println("Destroy method : Samosa");
    }
}
