package com.example.admin.baithuchanh4;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.test.ActivityTestCase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Admin on 3/9/2018.
 */
public class MyAdapter extends ArrayAdapter{

    private Activity context;
    private int resource;
    private ArrayList<Song> list;


    public MyAdapter(Activity context, int resource, ArrayList<Song> list) {
        super(context, resource, list);
        this.context = context;
        this.resource = resource;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View row = inflater.inflate(R.layout.custom_row, null);

        ImageView imgIcon = (ImageView) row.findViewById(R.id.imageViewIcon);
        TextView txtName = (TextView) row.findViewById(R.id.textViewName);
        TextView txtTacGia = (TextView) row.findViewById(R.id.textViewTacGia);

        Song song = list.get(position);

        imgIcon.setImageResource(song.getIcon());
        txtName.setText(song.getName());
        txtTacGia.setText(song.getTacGia());

        return row;

    }
}
