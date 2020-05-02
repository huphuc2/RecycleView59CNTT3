package vn.edu.ntu.huuphuc.model;

public class Product {
    String name,desc;
    int price;
    public Product(){

    }

    public Product(String name, int price, String desc){
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
