package com.example.admin.bth10.DTO;

/**
 * Created by Admin on 4/6/2018.
 */
public class Department {
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

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department(String name) {
        this.name = name;
    }

    private int id;
    private String name;


}
