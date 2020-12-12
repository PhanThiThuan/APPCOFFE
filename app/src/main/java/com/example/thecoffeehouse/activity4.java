package com.example.thecoffeehouse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class activity4 extends Fragment {
    ListView lv;
    ArrayList<thongbao> arrtb;
    thongbaoadapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_4,container,false);
        lv = (ListView) view.findViewById(R.id.listviewtb);
        arrtb = new ArrayList<>();
        arrtb.add(new thongbao(R.drawable.coffee,"Dặt hàng thành công !","52 phút trước"));
        arrtb.add(new thongbao(R.drawable.coffee,"Mua hàng thành công !","50 phút trước"));
        arrtb.add(new thongbao(R.drawable.coffeehouse,"Khuyến mãi coffeeHouse mua 1 tặng 1 đến hết ngày 25/12/2020 !","40 phút trước"));
        arrtb.add(new thongbao(R.drawable.coffeeden,"Đặt hàng thành công !","30 phút trước"));
        arrtb.add(new thongbao(R.drawable.coffeeden,"Mua hàng thành công !","27 phút trước"));
        adapter = new thongbaoadapter(getActivity(),R.layout.item_menu_tb,arrtb);
        lv.setAdapter(adapter);
        return view;
    }
}
