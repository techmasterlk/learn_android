package com.example.learn_android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
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
        Button emailBtn = findViewById(R.id.emailBtn);

        // setOnClickListener
        btn.setOnClickListener((v) -> {

            Intent i = new Intent(this, ActivityTwo.class);

            Bundle data = new Bundle();

            data.putString("USER", "Irosha");
            data.putInt("AGE", 25);

            i.putExtras(data);
            startActivity(i);

        });

        // send email implicit intent

        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"irosh@example.com"} );
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject bro");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "this is Body");
        emailIntent.setType("text/plain");

        emailBtn.setOnClickListener((v) -> {

           try {
               startActivity(emailIntent);
           }catch (ActivityNotFoundException e) {
               System.out.println(e);
           }

        });


    }
}