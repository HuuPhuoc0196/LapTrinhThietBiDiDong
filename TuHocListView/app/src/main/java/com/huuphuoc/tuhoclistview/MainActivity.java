package com.huuphuoc.tuhoclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvPhone;
    List<Phone> phoneList;
    PhoneAdapter phoneAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Load();
        phoneAdapter = new PhoneAdapter(MainActivity.this, R.layout.line_phone, phoneList);
        lvPhone.setAdapter(phoneAdapter);

    }

    void Load(){
        lvPhone = (ListView) findViewById(R.id.listViewPhone);

        phoneList = new ArrayList<Phone>();
        phoneList.add(new Phone("Iphone 5s", "5.000.000 VNĐ", R.drawable.ip5s));
        phoneList.add(new Phone("Iphone 6s", "7.000.000 VNĐ", R.drawable.ip6s));
        phoneList.add(new Phone("Iphone 6 Plus", "8.000.000 VNĐ", R.drawable.ip6plus));
        phoneList.add(new Phone("Iphone 7 Plus", "9.000.000 VNĐ", R.drawable.ip7plus));
        phoneList.add(new Phone("Iphone 8 Plus", "12.000.000 VNĐ", R.drawable.ip8lpus));
        phoneList.add(new Phone("Iphone 10", "17.000.000 VNĐ", R.drawable.ip10));
    }
}
