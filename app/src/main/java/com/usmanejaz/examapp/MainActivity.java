package com.usmanejaz.examapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo;
    DBHelper db;
    ListView myListView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.frexambtn);
        btnTwo = findViewById(R.id.resultbtn);
        myListView = findViewById(R.id.result);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FRExam fragmentOne = new FRExam();
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity, fragmentOne);
                transaction.commit();
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MyViewAdapter adapter = new MyViewAdapter(getApplicationContext(), db.displayResult());
                myListView.setAdapter(adapter);


            }
        });


    }


}
