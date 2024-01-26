package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second_layout extends AppCompatActivity {
Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout2);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainLayout();
            }
        });
    }
    public void openMainLayout(){
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(second_layout.this, MainActivity.class);
        startActivity(intent);
    }
}