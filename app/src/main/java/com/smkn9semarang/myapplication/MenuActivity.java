package com.smkn9semarang.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    ImageView ivMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ivMenu = findViewById(R.id.iv_menu);

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}