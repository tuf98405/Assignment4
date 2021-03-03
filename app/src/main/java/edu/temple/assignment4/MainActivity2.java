package edu.temple.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    ArrayList imageArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        imageArray = getIntent().getStringArrayListExtra("imageArray");
        int position = getIntent().getIntExtra("position", 0);

        imageView.setImageResource((Integer) imageArray.get(position));
        //textView.setText(getIntent().getStringExtra("image"));

    }
}