package com.springCoreRefrence;

public class B {
    public int y;

    public B(){

    }

    public B(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}
