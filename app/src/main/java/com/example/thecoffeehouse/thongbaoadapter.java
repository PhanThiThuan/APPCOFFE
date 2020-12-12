package com.example.thecoffeehouse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class thongbaoadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<thongbao> tblist;

    public thongbaoadapter(Context context, int layout, List<thongbao> tblist) {
        this.context = context;
        this.layout = layout;
        this.tblist = tblist;
    }

    @Override
    public int getCount() {
        return tblist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView texttb = (TextView)view.findViewById(R.id.tvtb);
        TextView texttg = (TextView)view.findViewById(R.id.tvtg);
        ImageView image = (ImageView)view.findViewById(R.id.imagetb);
        thongbao tb =tblist.get(position);
        texttb.setText(tb.getTexttb());
        texttg.setText(tb.getTg());
        image.setImageResource(tb.getImage());
        return view;
    }
//    public void removeItem(List<person> items){
//        for(person item : items){
//            personlist.remove(item);
//        }
//        notifyDataSetChanged();
//    }
}
