package edu.temple.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    int[] potatoArray = {R.drawable.straight, R.drawable.hydroberd, R.drawable.uwuberd};

    ImageView imageView;
    GridView gridV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridV = (GridView)findViewById(R.id.gridView);




        ImageAdapter adapter = new ImageAdapter(this, potatoArray);

        gridV.setAdapter(adapter);

        gridV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("image", potatoArray[position]);
                startActivity(intent);
            }
        });

    }
    /*
    private void showPicture(int position) {
        imageView.setImageResource((Integer) potatoArray.get(position));
    }
     */

}