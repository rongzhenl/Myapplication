package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.reminders_list_View);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.reminders_row,R.id.row_text,
        new String[]{"first record","second record","third record"});
        mListView.setAdapter(arrayAdapter);
        setContentView(R.layout.activity_main);
    }
}
