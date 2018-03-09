package com.example.admin.baithuchanh4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvListView;
    TextView txtMess;
    ArrayList<Song> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvListView = (ListView) findViewById(R.id.lvListView);
        txtMess = (TextView) findViewById(R.id.txtMess);

        list = new ArrayList<Song>(new Song(R.drawable.boulevard,"Boulevard","Dan Byrd"),
                new Song(R.drawable.happy_new_year,"Happy New Year","Abba"),
                new Song(R.drawable.right_here_waiting,"Right Here Waiting","Richard Marx"),
                new Song(R.drawable.thats_why,"That's Why","Michael Learns To Rock"),
                new Song(R.drawable.while_your_lips_are_still_red,"While Your Lips Are Still Red","Nightwish")
                );

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.custom_row, R.id.txtRow, list);

        lvListView.setAdapter(adapter);
        
        lvListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtMess.setText("Bạn vừa chọn: " + list[position]);
                Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + list[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
