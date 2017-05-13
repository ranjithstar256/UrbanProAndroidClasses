package kp.ranjith.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String s;
    TextView  textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView= (TextView) findViewById(R.id.textView);
        s = getIntent().getStringExtra("ragu");

        textView.setText(s);
    }
}
