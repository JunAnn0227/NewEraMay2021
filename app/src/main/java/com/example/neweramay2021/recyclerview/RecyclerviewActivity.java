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
        setListeners();
        initRecyclerView();

    }

    private void findViews(){
        recyclerView = findViewById(R.id.recylerview);
    }

    private void setListeners(){

    }

    private void initRecyclerView(){
        for(int i = 0; i < 50; i++){
            Contact contact = new Contact("Ann","0123456789");
            contactArrayList.add(contact);
        }


        ContactAdapter adapter = new ContactAdapter(RecyclerviewActivity.this, contactArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}