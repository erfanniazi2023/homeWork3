package com.itis.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("John", "john@email.com",R.drawable.a));
        items.add(new Item("Rober", "robert@email.com",R.drawable.b));
        items.add(new Item("James", "james@email.com",R.drawable.c));
        items.add(new Item("Ricky", "ricky@email.com",R.drawable.d));
        items.add(new Item("Mickey", "mickey@email.com",R.drawable.e));
        items.add(new Item("Pick", "pick@email.com",R.drawable.f));
        items.add(new Item("Leg Piece", "leg@email.com",R.drawable.g));
        items.add(new Item("Apple Mac", "Apple@email.com",R.drawable.h));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }


}