package com.example.shami.dhaka_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity5 extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        listView=(ListView)findViewById(R.id.listViewid);
        String [] FoodNames = getResources().getStringArray(R.array.food_name);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity5.this,R.layout.sample_view,R.id.textViewid,FoodNames);
        listView.setAdapter(adapter);
    }
}
