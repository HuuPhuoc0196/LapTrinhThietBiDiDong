package com.example.admin.thuchanh1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUser, edtPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = (EditText) findViewById(R.id.editTextUser);
        edtPass = (EditText) findViewById(R.id.editTextPassWord);
        btnLogin = (Button) findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"User Name : " + edtUser.getText() + "\nPassWord: " + edtPass.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
