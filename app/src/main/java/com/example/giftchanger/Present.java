package com.example.giftchanger;

public class Present {  //просто класс
    private String name;
    private String price;
    private String fame;
    private int presentResource;

    public Present(String name, String price, String fame, int presentResource) {
        this.name = name;
        this.price = price;
        this.fame = fame;
        this.presentResource = presentResource;
    }

    public int getPresentResource() {
        return presentResource;
    }

    public void setPresentResource(int presentResource) {
        this.presentResource = presentResource;
    }

    public Present(String name, String price, String fame) {
        this.name = name;
        this.price = price;
        this.fame = fame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFame() {
        return fame;
    }

    public void setFame(String fame) {
        this.fame = fame;
    }
}
