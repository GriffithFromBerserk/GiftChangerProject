package com.example.giftchanger;

import java.io.Serializable;

public class Present implements Serializable {  //класс сущности подарка с конструкторами, геттерами и сеттерами

    private String age;
    private String gender;
    private String price;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Present(String age, String gender, String price) {
        this.age = age;
        this.gender = gender;
        this.price = price;
    }
}