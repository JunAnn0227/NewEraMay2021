package com.example.neweramay2021;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SimpleListviewActivity extends AppCompatActivity {
    private ArrayList<String> arrayData = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listview);
        findViews();
        populateArrayList();
        initListview();
    }

    private void findViews(){
        listView = findViewById(R.id.listview);

    }

    private void populateArrayList(){
        arrayData.add("Mango");
        arrayData.add("Rambutan");
        arrayData.add("Pineapple");
        arrayData.add("Orange");

        for(int i = 0; i < 50; i++){
            arrayData.add("Strawberry");
        }
    }

    private void initListview(){
        FruitAdapter adapter = new FruitAdapter(SimpleListviewActivity.this, arrayData);
        listView.setAdapter(adapter);
    }
}