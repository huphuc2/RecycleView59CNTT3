package vn.edu.ntu.huuphuc.model.controller;

import android.app.Application;

import java.util.ArrayList;

import vn.edu.ntu.huuphuc.model.Product;

public class CartController extends Application implements ICartController {
    ArrayList<Product> listProduct = new ArrayList<>();
    public CartController(){
        listProduct.add(new Product("Xoài Cát",60000,"Xoài Cát loại 1"));
        listProduct.add(new Product("Khoai Lang",35000,"Khoai lang tím giống Nhật"));
        listProduct.add(new Product("Me Thái",55000,"Me nhập khẩu từ Thái"));
        listProduct.add(new Product("Ổi",60000,"Ổi ruột đỏ"));
        listProduct.add(new Product("Mít",120000,"Mít Tố Nữ loại 1"));
        listProduct.add(new Product("Táo đỏ",70000,"Táo đỏ nhập khẩu từ Mỹ"));
        listProduct.add(new Product("Sầu riêng Khánh Sơn",90000,"Sầu riêng Khánh Sơn loại 1"));
    }
    @Override
    public ArrayList<Product> getListProduct(){
        return listProduct;
    }
}
