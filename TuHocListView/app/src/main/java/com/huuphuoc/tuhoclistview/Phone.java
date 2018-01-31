package com.huuphuoc.tuhoclistview;

/**
 * Created by HuuPhuoc on 31/01/2018.
 */

public class Phone {
    private String Name;
    private  String Price = "Giá : ";
    private  int Img;

    public Phone(String name, String price, int img) {
        Name = name;
        Price = this.Price + price;
        Img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = this.Price + price;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }
}
