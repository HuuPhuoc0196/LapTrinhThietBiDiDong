package com.example.admin.bth10.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.admin.bth10.DTO.EmployeeDB;

/**
 * Created by Admin on 4/6/2018.
 */
public class DepartmentDAO {
    private static final String TAG = DepartmentDAO.class.getName();

    public DepartmentDAO(Context context) {
        this.context = context;
        employeeDB = EmployeeDB.getInstance(context);
    }

    Context context;
    EmployeeDB employeeDB;
    SQLiteDatabase db;


}
