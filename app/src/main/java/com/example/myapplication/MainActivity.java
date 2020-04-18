package com.example.myapplication;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] language = {"Java","C++","C","Maths","Science","Eglish","history","Geogrphy","Chemistory","Jitender","Singh"};
        setContentView(R.layout.activity_main);
        RecyclerView rc = findViewById(R.id.jit);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setAdapter(new ProgramingAdapter(language));


    }
}
