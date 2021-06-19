package com.example.neweramay2021.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.neweramay2021.R;

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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                String userClick = arrayData.get(i);
                Toast.makeText(SimpleListviewActivity.this, "You Clicked On: " + userClick, Toast.LENGTH_SHORT).show();
            }
        });
    }
}