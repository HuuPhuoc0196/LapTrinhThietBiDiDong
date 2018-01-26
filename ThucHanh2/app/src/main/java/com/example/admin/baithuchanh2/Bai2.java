package com.example.admin.baithuchanh2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Bai2 extends AppCompatActivity {
    TextView txtvQuestion;
    Button btnTrue, btnFalse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        txtvQuestion = (TextView) findViewById(R.id.textViewQuestion);
        btnTrue = (Button) findViewById(R.id.buttonTrue);
        btnFalse = (Button) findViewById(R.id.buttonFalse);

        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bai2.this, "Không có đáp án", Toast.LENGTH_SHORT).show();
            }
        });

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bai2.this, "Không có đáp án", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
