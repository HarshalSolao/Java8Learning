package com.demo.java.threadings;

public class Item {
    private double price;

    Item (double price){
        this.price = price;
    }
    Item (){
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                '}';
    }
}
