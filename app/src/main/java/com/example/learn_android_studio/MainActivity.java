package com.example.learn_android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get button reference
        Button btn = findViewById(R.id.btn);

        // setOnClickListener
        btn.setOnClickListener((v) -> {

            Intent i = new Intent(this, ActivityTwo.class);

            Bundle data = new Bundle();

            data.putString("USER", "Irosha");
            data.putInt("AGE", 25);

            i.putExtras(data);
            startActivity(i);

        });
    }
}