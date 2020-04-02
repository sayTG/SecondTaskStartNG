package com.example.secondtaskstartng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        final ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("I like being Content");
        arrayList.add("I like Lively, Positive and Funny people");
        arrayList.add("I like Cuddling");
        arrayList.add("I like Reading and trying something New");
        arrayList.add("I dislike Laziness");
        arrayList.add("I dislike Negative, Gloomy and Toxic people");
        arrayList.add("I dislike Injections and hate seeing Blood");
        arrayList.add("I dislike bad breath");
        arrayList.add("My hobbies are Games, Reading and Sports");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayList.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });

        }
}
