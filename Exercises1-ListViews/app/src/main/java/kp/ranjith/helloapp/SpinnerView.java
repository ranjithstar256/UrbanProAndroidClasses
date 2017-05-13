package kp.ranjith.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SpinnerView extends AppCompatActivity {
    ListView lv = null;
    ArrayList<String> al = new ArrayList<>();
    ArrayAdapter<String> aa = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        Spinner lv_view = (Spinner)findViewById(R.id.spinner1);

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

        aa = new ArrayAdapter<String>(SpinnerView.this,android.R.layout.activity_list_item,al);
        lv.setAdapter(aa);

        lv_view.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnerView.this, "clicked on "+al.get(position), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
