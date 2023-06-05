package com.example.giftchanger;

public class Present {  //класс сущности подарка с конструкторами, геттерами и сеттерами
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPresentResource() {
        return presentResource;
    }

    public void setPresentResource(int presentResource) {
        this.presentResource = presentResource;
    }

    private String name;
    private String price;
    private String gender;
    private int presentResource;

    public Present(String name, String price, String gender, int presentResource) {
        this.name = name;
        this.price = price;
        this.gender = gender;
        this.presentResource = presentResource;
    }
}