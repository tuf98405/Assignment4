package edu.temple.assignment4;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter{

    Context context;
    int[] items;
    LayoutInflater inflater;
    String imageName;

    public ImageAdapter (Context context, int[] items){
        this.context = context;
        this.items = items;
        inflater = (LayoutInflater.from(context));
    }

    public String getImageName(){
        return imageName;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_main, null);
        ImageView image = (ImageView) convertView.findViewById(R.id.icon);
        TextView title = (TextView) convertView.findViewById(R.id.iconTitle);

        imageName = convertView.getResources().getResourceName(items[position]);
        int pos = imageName.indexOf("/") + 1;
        imageName = imageName.substring(pos);

        image.setImageResource(items[position]);
        title.setText(imageName);

        title.setGravity(Gravity.CENTER);

        return convertView;
    }

    public View getDropDownView(){
        return null;
    }

}
