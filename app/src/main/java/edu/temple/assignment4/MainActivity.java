package edu.temple.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList potatoArray;

    ImageView imageView;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);


        potatoArray = new ArrayList<String>();
        potatoArray.add(R.drawable.straight);
        potatoArray.add(R.drawable.hydroberd);
        potatoArray.add(R.drawable.uwuberd);



        ImageAdapter adapter = new ImageAdapter(this, potatoArray);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putStringArrayListExtra("imageArray", potatoArray);
                intent.putExtra("position", position);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "Item Unselected", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void showPicture(int position) {
        imageView.setImageResource((Integer) potatoArray.get(position));
    }

}