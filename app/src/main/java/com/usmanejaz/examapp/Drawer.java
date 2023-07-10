package com.usmanejaz.examapp;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class Drawer extends AppCompatActivity {
DrawerLayout drawer;
NavigationView nav;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        drawer = findViewById(R.id.drawer);
        nav = findViewById(R.id.nav);
        toolbar = findViewById(R.id.toolbar);



        setSupportActionBar(toolbar);

        ActionBarDrawerToggle at = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);
        drawer.addDrawerListener(at);
        at.syncState();


    }
}