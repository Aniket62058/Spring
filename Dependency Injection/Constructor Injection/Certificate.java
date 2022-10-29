package com.springCoreCons;

public class Certificate {
    private String certi;

    public Certificate(String certi) {
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "[\tCerification : "+certi+"\t]";
    }
}
