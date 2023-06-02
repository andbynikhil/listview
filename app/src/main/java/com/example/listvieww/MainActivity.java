package com.example.listvieww;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview1;
    ArrayList<String> arr1= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview1=findViewById(R.id.listview);
        arr1.add("nikhil");
        arr1.add("nikhil2");
        arr1.add("nikh2il");
        arr1.add("nikhi2l");
        arr1.add("nikhi3l");
        arr1.add("ni5khil");
        arr1.add("ni7khil");
        arr1.add("nik9hil");
        arr1.add("nikh0il");
        arr1.add("nikhi-l");
        arr1.add("1nikhil4");
        arr1.add("2nikhil");
        arr1.add("n3ikhil");
        arr1.add("ni4khil");
        arr1.add("nik6hil");
        arr1.add("nikhil");
        arr1.add("nikh89il");
        arr1.add("nikhil");
        ArrayAdapter<String> adap1=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr1);
        listview1.setAdapter(adap1);


    }
}