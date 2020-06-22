package com.farmers.market.utils;

public class VegetableModel {
    private String sku;
    private String name;
    private int stock;
    private String category;
    private String price;
    private String detail;
    private int image;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "VegetableModel{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", detail='" + detail + '\'' +
                ", image=" + image +
                '}';
    }
}
