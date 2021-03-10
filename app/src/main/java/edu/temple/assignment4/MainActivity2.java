package edu.temple.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        intent = getIntent();
        String name = getIntent().getStringExtra(("name"));


        imageView.setImageResource(intent.getIntExtra("image",0));
        textView.setText(name);


    }
}