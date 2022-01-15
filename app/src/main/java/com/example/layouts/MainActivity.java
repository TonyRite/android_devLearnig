package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView citiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.Citieslist);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("dodoma");
        cities.add("dar es salaam");
        cities.add("dodoma");
        cities.add("dar es salaam");
        cities.add("dodoma");
        cities.add("dar es salaam");
        cities.add("dodoma");
        cities.add("dar es salaam");
        cities.add("dodoma");
        cities.add("dar es salaam");

        ArrayAdapter<String> citiesadapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );
        citiesList.setAdapter(citiesadapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position) + " Selected ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}