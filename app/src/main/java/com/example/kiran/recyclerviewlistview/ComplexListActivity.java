package com.example.kiran.recyclerviewlistview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import Adapter.RecyclerViewAdapter;
import model.Contacts;

public class ComplexListActivity extends AppCompatActivity {

    private static final String TAG = "ComplexListActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final List<Contacts> contacts = new ArrayList<>();

        contacts.add(new Contacts("Kiran Rana","Person1",1));
        contacts.add(new Contacts("Anita Rana","Person2",1));
        contacts.add(new Contacts("Aarush Rana","Person3",2));
        contacts.add(new Contacts("Achyut Timinsina","Person4",3));
        contacts.add(new Contacts("Niman Maharjan","Person5",4));


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,contacts);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
