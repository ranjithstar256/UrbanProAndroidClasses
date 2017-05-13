package kp.ranjith.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {
    GridView lv = null;
    ArrayList<String> al = new ArrayList<>();
    ArrayAdapter<String> aa = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        GridView lv_view = (GridView)findViewById(R.id.gridView1);

        al.add("text 1");
        al.add("text 10");
        al.add("text 100");
        al.add("text 10000");
        al.add("text 100");
        al.add("text 10000");
        al.add("text 1000000000");
        al.add("text 100000000");
        al.add("text 100000");
        al.add("text 10000000");
        al.add("text 10");
        al.add("text 1");
        al.add("text 1000");
        al.add("text 10000000");
        al.add("text 100000");
        al.add("text 10");
        al.add("text 100");

        aa = new ArrayAdapter<String>(GridViewActivity.this,android.R.layout.activity_list_item,al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this, "clicked on "+al.get(position), Toast.LENGTH_SHORT).show();

                switch (position){


                }
            }
        });


    }
}
