package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.security.auth.Destroyable;

public class Pepsi implements InitializingBean, DisposableBean {
    private int price;

    public Pepsi(){

    }

    public Pepsi(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Buying Pepsi : INIT");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Putting bottle in dustbin : Destroy");
    }
}
