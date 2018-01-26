package com.example.admin.baithuchanh2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdbtnGroup;
    RadioButton rdbtnDecaf, rdbtnColombia, rdbtnExpresso;
    CheckBox cbCream, cbSugar;
    Button btnPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdbtnGroup = (RadioGroup) findViewById(R.id.rdbtnGroup);
        rdbtnDecaf = (RadioButton) findViewById(R.id.radioButtonDecaf);
        rdbtnColombia = (RadioButton) findViewById(R.id.radioButtonColombian);
        rdbtnExpresso = (RadioButton) findViewById(R.id.radioButtonExpresso);
        cbCream = (CheckBox) findViewById(R.id.checkBoxCream);
        cbSugar = (CheckBox) findViewById(R.id.checkBoxSugar);
        btnPay = (Button) findViewById(R.id.buttonPay);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                int idCheck = rdbtnGroup.getCheckedRadioButtonId();
                switch (idCheck){
                    case R.id.radioButtonDecaf:
                        s += rdbtnDecaf.getText();
                        break;
                    case R.id.radioButtonColombian:
                        s += rdbtnColombia.getText();
                        break;
                    case R.id.radioButtonExpresso:
                        s += rdbtnExpresso.getText();
                        break;
                }
                if(cbCream.isChecked()){
                    s+= " & " + cbCream.getText();
                }

                if(cbSugar.isChecked())
                {
                    s+= " & " + cbSugar.getText();
                }

                Toast.makeText(MainActivity.this,s, Toast.LENGTH_LONG).show();
            }
        });
    }
}
