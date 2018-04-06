package com.example.admin.bth10.DTO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lvtuan on 3/23/2018.
 */
// reference: http://guides.codepath.com/android/local-databases-with-sqliteopenhelper

public class EmployeeDB extends SQLiteOpenHelper {

    // Database Info
    private static final String DATABASE_NAME = "EmployeeManagementDB";
    private static final int DATABASE_VERSION = 1;

    // Table Names
    private static final String TABLE_DEPARTMENT = "Department";
    private static final String TABLE_EMPLOYEE = "Employee";

    public static String getTableDepartment() {
        return TABLE_DEPARTMENT;
    }

    // Department Table Columns
    private static final String DEPARTMENT_ID = "Id";
    private static final String DEPARTMENT_NAME = "Name";

    public static String getDepartmentName() {
        return DEPARTMENT_NAME;
    }

    // Employee Table Columns
    private static final String EMPLOYEE_ID = "Id";
    private static final String EMPLOYEE_LASTNAME = "LasttName";
    private static final String EMPLOYEE_FIRSTNAME = "FirstName";
    private static final String EMPLOYEE_DEPARTMENT_ID_FK = "departmentId";


    //Singleton Pattern
    private static EmployeeDB sInstance;
    public static synchronized EmployeeDB getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = new EmployeeDB(context.getApplicationContext());
        }
        return sInstance;
    }

    /**
     * Constructor should be private to prevent direct instantiation.
     * Make a call to the static method "getInstance()" instead.
     */
    private EmployeeDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Called when the database is created for the FIRST time.
    // If a database already exists on disk with the same DATABASE_NAME, this method will NOT be called.
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_DEPARTMENT_TABLE = "CREATE TABLE " + TABLE_DEPARTMENT +
                "(" +
                DEPARTMENT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                DEPARTMENT_NAME + " TEXT" +
                ")";

        String CREATE_EMPLOYEE_TABLE = "CREATE TABLE " + TABLE_EMPLOYEE +
                "(" +
                EMPLOYEE_ID + " INTEGER PRIMARY KEY," + // Define a primary key
                EMPLOYEE_FIRSTNAME + " TEXT," +
                EMPLOYEE_LASTNAME + " TEXT," +
                EMPLOYEE_DEPARTMENT_ID_FK + " INTEGER CONSTRAINT FK_DEPARTMENT REFERENCES " + TABLE_DEPARTMENT + " ON UPDATE CASCADE" + // Define a foreign key
                ")";

        db.execSQL(CREATE_DEPARTMENT_TABLE);
        db.execSQL(CREATE_EMPLOYEE_TABLE);
    }

    // Called when the database needs to be upgraded.
    // This method will only be called if a database already exists on disk with the same DATABASE_NAME,
    // but the DATABASE_VERSION is different than the version of the database that exists on disk.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Simplest implementation is to drop all old tables and recreate them
        if (newVersion != oldVersion){
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMPLOYEE);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_DEPARTMENT);
            onCreate(db);
        }
    }
}





