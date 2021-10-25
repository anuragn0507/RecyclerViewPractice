package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private ArrayList<City> initCities () {
        ArrayList<City> list = new ArrayList<>();
        list.add(new City  ("Bhopal lake view", "The coastline , the five villages in Italy.", "http://bhopal.com"));
        list.add(new City  ("Raisen ka Kila", "The coastline , the five villages in Italy.", "http://bhopal.com"));
        list.add(new City  ("Bareli Chhind Mandir", "The coastline , the five villages in Italy.", "http://bhopal.com"));

        return list;

    }
}