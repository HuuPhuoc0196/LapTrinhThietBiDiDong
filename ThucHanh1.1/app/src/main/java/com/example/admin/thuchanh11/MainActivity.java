package com.example.admin.thuchanh11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtDollars, edtVNDs;
    Button btnClear, btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtDollars = (EditText) findViewById(R.id.editTextDollars);
        edtVNDs = (EditText)findViewById(R.id.editTextVNDs);
        btnClear = (Button) findViewById(R.id.buttonClear);
        btnConvert = (Button) findViewById(R.id.buttonConert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtDollars.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Bạn cần nhập số tiền cần chuyển trước", Toast.LENGTH_LONG).show();
                    edtDollars.requestFocus();
                    return;
                }
                Long dollars = Long.parseLong(edtDollars.getText().toString());
                Long vnds = dollars * 22000;
                edtVNDs.setText("" + vnds);
                Toast.makeText(MainActivity.this, "Chuyển đổi thành công", Toast.LENGTH_LONG).show();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtDollars.setText("");
                edtVNDs.setText("");
                Toast.makeText(MainActivity.this, "Bạn vừa nhấn Clear", Toast.LENGTH_LONG).show();
            }
        });
    }
}
