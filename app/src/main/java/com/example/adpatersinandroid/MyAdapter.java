package com.example.adpatersinandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter  extends BaseAdapter {

    private Context context;
    private String[] items;


    public MyAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView==null){
             convertView= LayoutInflater.from(context).inflate(R.layout.my_list_view,parent,
                     false);
             viewHolder=new ViewHolder();
             viewHolder.textView=convertView.findViewById(R.id.textView);
             convertView.setTag(viewHolder);

        }else{
            viewHolder=(ViewHolder) convertView.getTag();
        }

        viewHolder.textView.setText(items[position]);
        return convertView;
    }

    static class ViewHolder{
        TextView textView;

    }
}