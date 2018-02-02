package com.example.admin.buoi3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtCode, edtSoSachMuon, edtNgayMuon;
    RadioButton rdGV, rdSV;
    Button btnAdd;
    ListView lvDSDocGia;

    ArrayList<String> arr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Load();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arr.add(edtName.getText() + "   " + edtCode.getText());
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,arr );
                lvDSDocGia.setAdapter(adapter);

            }
        });
    }

    void Load(){

        edtName = (EditText) findViewById(R.id.editTextName);
        edtCode = (EditText) findViewById(R.id.editTextCode);
        edtSoSachMuon = (EditText) findViewById(R.id.editTextSachMuon);
        edtNgayMuon = (EditText) findViewById(R.id.editTextNgayMuon);

        rdGV = (RadioButton) findViewById(R.id.radioButtonGV);
        rdSV = (RadioButton) findViewById(R.id.radioButtonSV);

        btnAdd = (Button) findViewById(R.id.buttonAdd);

        lvDSDocGia = (ListView) findViewById(R.id.listViewDS);


    }
}
