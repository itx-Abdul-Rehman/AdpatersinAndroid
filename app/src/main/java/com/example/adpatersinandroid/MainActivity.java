package com.example.adpatersinandroid;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.listview);

        String[] countries=getResources().getStringArray(R.array.countries);
        MyAdapter adapter=new MyAdapter(this,countries);
        listview.setAdapter(adapter);
    }
}