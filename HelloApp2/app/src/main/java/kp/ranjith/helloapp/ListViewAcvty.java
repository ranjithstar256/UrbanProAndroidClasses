package kp.ranjith.helloapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewAcvty extends AppCompatActivity {

/// ListView listView;

    Spinner gridView;
    ArrayList<String> contents;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_acvty);
        gridView= (Spinner) findViewById(R.id.gridv);
        contents=new ArrayList<String>();

        contents.add("Ramu");
        contents.add("asf");
        contents.add("asd");
        contents.add("sdgsdgsdg");
        contents.add("dsg");
        contents.add("Raggsmu");
        contents.add("Rasdgsdmu");
        contents.add("Rasssdggmu");
     contents.add("Ramu");
        contents.add("asf");
        contents.add("asd");
        contents.add("sdgsdgsdg");
        contents.add("dsg");
        contents.add("Raggsmu");
        contents.add("Rasdgsdmu");
        contents.add("Rasssdggmu");
     contents.add("Ramu");
        contents.add("asf");
        contents.add("asd");
        contents.add("sdgsdgsdg");
        contents.add("dsg");
        contents.add("Raggsmu");
        contents.add("Rasdgsdmu");
        contents.add("Rasssdggmu");
     contents.add("Ramu");
        contents.add("asf");
        contents.add("asd");
        contents.add("sdgsdgsdg");
        contents.add("dsg");
        contents.add("Raggsmu");
        contents.add("Rasdgsdmu");
        contents.add("Rasssdggmu");
     contents.add("Ramu");
        contents.add("asf");
        contents.add("asd");
        contents.add("sdgsdgsdg");
        contents.add("dsg");
        contents.add("Raggsmu");
        contents.add("Rasdgsdmu");
        contents.add("Rasssdggmu");
     contents.add("Ramu");
        contents.add("asf");
        contents.add("asd");
        contents.add("sdgsdgsdg");
        contents.add("dsg");
        contents.add("Raggsmu");
        contents.add("Rasdgsdmu");
        contents.add("Rasssdggmu");

        arrayAdapter=new ArrayAdapter<String>(ListViewAcvty.this,android.R.layout.simple_list_item_1,contents);

        gridView.setAdapter(arrayAdapter);


    /*    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewAcvty.this, "clicked on "+contents.get(position), Toast.LENGTH_SHORT).show();

                switch (position){


                }
            }
        });*/

    gridView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(ListViewAcvty.this, "clicked on "+contents.get(position), Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });

    }
}
// ramu somu kumar
// contents --> Listarray --> arrayyadapter --> listv