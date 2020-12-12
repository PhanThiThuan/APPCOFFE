package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class OptionMenu extends AppCompatActivity {
    private ImageView rollback;
    private Button rollbackbtn;
    private Button placeholder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
        rollback = (ImageView) findViewById(R.id.rollback2);
        rollback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionMenu.this,MenuApp.class);
                startActivity(intent);
            }
        });
        rollbackbtn = (Button) findViewById(R.id.rollbackbtn);
        rollbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionMenu.this,MenuApp.class);
                startActivity(intent);
            }
        });
        placeholder = (Button) findViewById(R.id.placeholderbtn);
        placeholder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionMenu.this,placeholder.class);
                startActivity(intent);
            }
        });
    }
}