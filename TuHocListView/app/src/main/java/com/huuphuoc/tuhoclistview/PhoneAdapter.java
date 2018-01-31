package com.huuphuoc.tuhoclistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HuuPhuoc on 31/01/2018.
 */

public class PhoneAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Phone> PhoneList;

    public PhoneAdapter(Context context, int layout, List<Phone> phoneList) {
        this.context = context;
        this.layout = layout;
        PhoneList = phoneList;
    }

    @Override
    public int getCount() {
        return PhoneList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        // Ánh xạ
        TextView txtvName = (TextView) view.findViewById(R.id.textViewName);
        TextView txtvPrice = (TextView) view.findViewById(R.id.textViewPrice);
        ImageView imgPhone = (ImageView) view.findViewById(R.id.imageViewPhone);

        // Gán giá trị
        Phone phone = PhoneList.get(i);

        txtvName.setText(phone.getName());
        txtvPrice.setText(phone.getPrice());
        imgPhone.setImageResource(phone.getImg());

        return view;
    }
}
