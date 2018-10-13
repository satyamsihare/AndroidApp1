package com.example.satyam.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList=(RecyclerView)findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] languages={"11710511","11710512","11710513","11710514","11710515","11710516",
                "11710517","11710518","11710519","11710520","11710521","11710522"};
        programmingList.setAdapter(new ProgrammingAdapter(languages));
    }
}
