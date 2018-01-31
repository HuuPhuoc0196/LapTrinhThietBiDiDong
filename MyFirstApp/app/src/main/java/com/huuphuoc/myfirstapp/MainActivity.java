package com.huuphuoc.myfirstapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2;
    TextView txtvKetQua;
    Button btnCong, btnTru, btnNhan, btnChia, btnRandom, btnManHinh;
    ConstraintLayout manHinh;

    public void TinhToan(Button btn) {
        String chuoi1 = String.valueOf(edtSo1.getText());
        String chuoi2 = String.valueOf(edtSo2.getText());

        if(chuoi1.equals(""))
            MessageBox("Bạn cần nhập số thứ nhất");
        else if(chuoi2.equals(""))
            MessageBox("Bạn cần nhập số thứ hai");
        else {
            double so1 = Double.parseDouble(chuoi1);
            double so2 = Double.parseDouble(chuoi2);
            double ketqua = PhepToan(btn, so1, so2);

            txtvKetQua.setText("Kết quả là: " + String.valueOf(ketqua));
        }
    }

    public double PhepToan(Button btn, double so1, double so2){
        double ketqua = 0;
        switch (String.valueOf(btn.getText())) {
            case "+":
                ketqua = so1 + so2;
                break;
            case "-":
                ketqua = so1 - so2;
                break;
            case "x":
                ketqua = so1 * so2;
                break;
            case "/":
                if (so2 == 0) {
                    MessageBox("Phép toán không hộp lệ! \nKhông thể chia cho 0");
                }
                else ketqua = so1 / so2;
        }
        return ketqua;
    }

    public void MessageBox(String s){
        // MessageBox
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);;
        builder.setTitle("Thông báo");
        builder.setMessage(s);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // TODO
            }
        });
        builder.show();
    }

    public void Toasts(String s){
        Toast.makeText(
                MainActivity.this, s, Toast.LENGTH_LONG
        ).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toasts("Chào mừng bạn đến với MyFirstApp");

        edtSo1 = (EditText) findViewById(R.id.editTextSo1);
        edtSo2 = (EditText) findViewById(R.id.editTextSo2);
        txtvKetQua = (TextView) findViewById(R.id.textViewKetQua);
        btnRandom = (Button) findViewById(R.id.buttonRandom);
        btnCong = (Button) findViewById(R.id.buttonCong);
        btnTru = (Button) findViewById(R.id.buttonTru);
        btnNhan = (Button) findViewById(R.id.buttonNhan);
        btnChia = (Button) findViewById(R.id.buttonChia);
        btnManHinh = (Button) findViewById(R.id.buttonManHinh);

        btnManHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // load màn hình backgroud
                manHinh = (ConstraintLayout) findViewById(R.id.ManHinh);
                manHinh.setBackgroundResource(R.drawable.image);
                btnManHinh.setEnabled(false);
            }
        });

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int temp = r.nextInt(50) + 1;
                double so1 = r.nextDouble() * temp;
                double so2 = r.nextDouble() *temp;
                edtSo1.setText(String.valueOf(so1));
                edtSo2.setText(String.valueOf(so2));
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TinhToan(btnTru);
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               TinhToan(btnCong);
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TinhToan(btnNhan);
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TinhToan(btnChia);
            }
        });

    }

}
