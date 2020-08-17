package com.neuedu.object.example;

public class Goods {
    /*
    * 商品：
    *     商品名：String name;
    *     商品单价：double price;
    *     单位：String unitOfMeasurement;

     *     库存：int stock;
    *
    * */
    private String name;
    private double price;
    private String unitOfMeasurement;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                ", stock=" + stock +
                '}';
    }
}
