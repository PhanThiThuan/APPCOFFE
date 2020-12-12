package com.example.thecoffeehouse;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter < String > {

    private final Activity context;
    private final String[] web;
    private final String[] cs;
    private final Integer[] imageId;

    public CustomList(Activity context, String[] web, String[] cs, Integer[] imageId)
    {
        super(context, R.layout.list, web);
        this.context = context;
        this.web = web;
        this.cs = cs;
        this.imageId = imageId;

    }@Override
    public View getView(int position, View view, ViewGroup parent)
    {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.t1);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.t2);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.h);
        txtTitle.setText(web[position]);
        txtTitle2.setText(cs[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;

    }
}