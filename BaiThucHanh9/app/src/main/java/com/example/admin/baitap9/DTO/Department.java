package com.example.admin.baitap9.DTO;

/**
 * Created by Admin on 3/23/2018.
 */
public class Department {
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;

    public Department(String name) {
        this.name = name;
    }

    private String name;

}
