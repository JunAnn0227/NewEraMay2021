package com.example.neweramay2021.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.neweramay2021.R;

import java.util.ArrayList;


public class RecyclerviewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Contact> contactArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        findViews();
        initRecyclerView();

    }

    private void findViews(){
        recyclerView = findViewById(R.id.recyclerview);
    }

    private void initRecyclerView(){
        contactArrayList.add(new Contact("BK", "1232534467"));
        contactArrayList.add(new Contact("John", "1122233887"));
        contactArrayList.add(new Contact("Jack", "1254422312"));
        contactArrayList.add(new Contact("Ali", "1234581818"));
        contactArrayList.add(new Contact("ABC", "2918210118"));
        contactArrayList.add(new Contact("CDE", "129291821"));
        contactArrayList.add(new Contact("EFG", "9199128191"));


        ContactAdapter adapter = new ContactAdapter(RecyclerviewActivity.this, contactArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}