package com.example.admin.baithuchanh4;

/**
 * Created by Admin on 3/9/2018.
 */
public class Song {
    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Song(int icon, String tacGia, String name) {
        this.icon = icon;
        this.tacGia = tacGia;
        this.name = name;
    }

    private int icon;
    private String name;
    private String tacGia;
}
