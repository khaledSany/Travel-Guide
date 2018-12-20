package com.example.shami.dhaka_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity6 extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        listView=(ListView)findViewById(R.id.listVewid1);
        String [] PlaceNmae = getResources().getStringArray(R.array.Place);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity6.this,R.layout.sample_view,R.id.textViewid,PlaceNmae);
        listView.setAdapter(adapter);
    }
}
