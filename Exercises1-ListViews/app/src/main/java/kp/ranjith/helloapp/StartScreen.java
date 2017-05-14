package kp.ranjith.helloapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class StartScreen extends AppCompatActivity {

    Button radio1,radio2, radio3;   // always follow 
    //1.Declaration above oncreate
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        
        
        radio1 = (Button) findViewById(R.id.radioButton); //2.initialization inside oncreate
        radio2 = (Button) findViewById(R.id.radioButton);
        radio3 = (Button) findViewById(R.id.radioButton); // its recommended to initialize the variables inside oncreate method

    }

    public void onListViewClick(View v){

        Intent startIntent = null;
        
        //id = v.getId();
        // we have to use switch here.. // recommended 
        
        // i think there's more changes are there.. i will tell you clearly in todays class :)

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
