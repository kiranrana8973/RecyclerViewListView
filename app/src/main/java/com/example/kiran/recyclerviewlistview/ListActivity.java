package com.example.kiran.recyclerviewlistview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import model.Contacts;

public class ListActivity extends AppCompatActivity {


    private ListView lstContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lstContacts = findViewById(R.id.lstContacts);

        final List<Contacts> contacts = new ArrayList<>();

        contacts.add(new Contacts("Kiran Rana","Person",1));
        contacts.add(new Contacts("Anita Rana","Person",1));
        contacts.add(new Contacts("Aarush Rana","Person",2));
        contacts.add(new Contacts("Achyut Timinsina","Person",3));
        contacts.add(new Contacts("Niman Maharjan","Person",4));
 

        ArrayAdapter<Contacts> arrayAdapter = new ArrayAdapter<Contacts>(this,android.R.layout.simple_list_item_1,contacts);
        lstContacts.setAdapter(arrayAdapter);

        lstContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),contacts.get(position).toString() , Toast.LENGTH_LONG).show();
            }
        });

    }
}