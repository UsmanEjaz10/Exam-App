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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree;
    DBHelper db;
    ListView myListView;
    TextView myTextView;
    List<Question> list = new ArrayList<Question>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnOne = findViewById(R.id.frexambtn);
        btnTwo = findViewById(R.id.resultbtn);
        btnThree = findViewById(R.id.back);
        db = new DBHelper(getApplicationContext());


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.clearDB();
                FRExam fragmentOne = new FRExam();
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity, fragmentOne);
                transaction.commit();
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultDisplay fragmentOne = new ResultDisplay();
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity, fragmentOne);
                transaction.commit();
                btnThree.setVisibility(View.VISIBLE);
          //      MyViewAdapter adapter = new MyViewAdapter(getApplicationContext(), list);
          //      myListView.setAdapter(adapter);


            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.clearDB();
                FRExam fragmentOne = new FRExam();
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity, fragmentOne);
                transaction.commit();
            }
        });


    }


}
