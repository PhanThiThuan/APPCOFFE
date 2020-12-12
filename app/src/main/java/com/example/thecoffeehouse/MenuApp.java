package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuApp extends AppCompatActivity {
    private ImageView rollback;
    private ImageView customMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);
        rollback = (ImageView) findViewById(R.id.rollback);
        rollback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuApp.this,MainActivity.class);
                startActivity(intent);
            }
        });
        customMenu = (ImageView) findViewById(R.id.capp);
        customMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuApp.this,OptionMenu.class);
                startActivity(intent);
            }
        });
    }
}