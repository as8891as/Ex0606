package com.example.ex0606;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageV;
    Button btn;
    int imageNum;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageV=findViewById(R.id.imageV);
        btn=findViewById(R.id.btn);
    }

    public void pressed(View view) {
        imageNum=rnd.nextInt(3)+1;
        if (imageNum==1)
        {
            imageV.setImageResource(R.drawable.image1);
        }
        else
        {
            if (imageNum==2)
            {
                imageV.setImageResource(R.drawable.image2);
            }
            else
            {
                imageV.setImageResource(R.drawable.image3);
            }
        }
        btn.setText(""+imageNum);
    }
}