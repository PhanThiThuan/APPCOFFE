package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class placeholder extends AppCompatActivity {
    private ImageView rollback;
    private Button rollbackmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeholder);
        rollback = (ImageView) findViewById(R.id.rollback3);
        rollback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(placeholder.this,OptionMenu.class);
                startActivity(intent);
            }
        });
        rollbackmain = (Button) findViewById(R.id.backtomain);
        rollbackmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(placeholder.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}