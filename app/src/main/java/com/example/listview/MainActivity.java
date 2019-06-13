package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.listView);
        final ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("mulham");
        arrayList.add("molham");
        arrayList.add("molhandro");
        arrayList.add("mulhandro");
        arrayList.add("malahem");
        arrayList.add("abo omar");
        arrayList.add("fathi");
        arrayList.add("hassan");
        arrayList.add("mulham");
        arrayList.add("molham");
        arrayList.add("molhandro");
        arrayList.add("mulhandro");
        arrayList.add("malahem");
        arrayList.add("abo omar");
        arrayList.add("fathi");
        arrayList.add("hassan");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"hello " + arrayList.get(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
