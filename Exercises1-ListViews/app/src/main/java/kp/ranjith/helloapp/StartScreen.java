package kp.ranjith.helloapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

    }

    public void onListViewClick(){
        Button radio1 = (Button) findViewById(R.id.radioButton);
        Button radio2 = (Button) findViewById(R.id.radioButton);
        Button radio3 = (Button) findViewById(R.id.radioButton);

        Intent startIntent = null;

        if (radio1.isSelected()){
            startIntent =  new Intent(StartScreen.this, ListViewActivity.class);
            startActivity(startIntent);
        }
        else if (radio2.isSelected()){
            startIntent =  new Intent(StartScreen.this, SpinnerView.class);
            startActivity(startIntent);
        }
        else if (radio3.isSelected()){
            startIntent =  new Intent(StartScreen.this, GridViewActivity.class);
            startActivity(startIntent);
        }
        else{
            Toast.makeText(StartScreen.this, "Please choose a type of list view and click on the submit button", Toast.LENGTH_SHORT).show();
        }
    }
}
