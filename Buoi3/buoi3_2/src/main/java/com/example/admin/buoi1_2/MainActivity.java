package com.example.admin.buoi1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtvMsg;
    Spinner spItems;
    String[] items = {"Khoa Quản trị Kinh Doanh", "Khoa Kế toán", "Tài chính - Ngân hàng", "Kinh tế luật", "Công nghệ thông tin", "Sinh hoc"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvMsg = (TextView) findViewById(R.id.textViewMess);
        spItems = (Spinner) findViewById(R.id.spinnerItems);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                items
        );

        spItems.setAdapter(arrayAdapter);

        txtvMsg.setText(items[0]);

        spItems.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtvMsg.setText(items[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
