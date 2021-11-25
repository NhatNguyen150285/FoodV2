package com.example.foodreviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<com.example.foodreviewproject.DanhMuc> arrayList;


    LayoutInflater inflater;

    public GridAdapter(Context context, int layout, ArrayList<com.example.foodreviewproject.DanhMuc> arrayList ) {
        this.context = context;
        this.arrayList = arrayList;
        this.layout = layout;
    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView textAll;
        ImageView imageAll;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder viewHolder ;

        if (convertView == null)
        {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            viewHolder = new ViewHolder();

            viewHolder.imageAll = convertView.findViewById(R.id.imageAll);
            viewHolder.textAll = convertView.findViewById(R.id.textAll);

            convertView.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) convertView.getTag();
        }


        viewHolder.imageAll.setImageResource(arrayList.get(position).hinhAnh);
        viewHolder.textAll.setText(arrayList.get(position).tenDM);


        return convertView;
    }



}
