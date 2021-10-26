package com.example.recyclerviewpractice;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private RecyclerView cities;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<City> cities = initCities();

        this.cities = (RecyclerView) findViewById(R.id.cities);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        this.cities.setLayoutManager(mLayoutManager);


        adapter = new CityAdapter(cities);
        this.cities.setAdapter(adapter);
    }

    private ArrayList<City> initCities () {
        ArrayList<City> list = new ArrayList<>();
        list.add(new City  ("Bhopal lake view", "The coastline , the five villages in Italy.", "http://bhopal.com"));
        list.add(new City  ("Raisen ka Kila", "The coastline , the five villages in Italy.", "http://bhopal.com"));
        list.add(new City  ("Bareli Chhind Mandir", "The coastline , the five villages in Italy.", "http://bhopal.com"));

        return list;

    }
}