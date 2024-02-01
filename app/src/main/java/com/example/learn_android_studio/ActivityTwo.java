package com.example.learn_android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button btn2 = findViewById(R.id.btn2);
        TextView txtUser = findViewById(R.id.userName);
        TextView txtAge = findViewById(R.id.age);

        Intent getIntent = getIntent();
        Bundle data = getIntent.getExtras();

        String userName = data.getString("USER", "Guest") ;
        int age = data.getInt("AGE", 18);

        txtUser.setText(userName);
        txtAge.setText(String.valueOf(age));


        btn2.setOnClickListener((v) -> {

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });



    }
}