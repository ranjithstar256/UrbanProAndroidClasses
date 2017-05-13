package kp.ranjith.helloapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    String s;
    //declaration above oncreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.ragu);
        editText= (EditText) findViewById(R.id.editText);
        //initila.. inside oncreate method
        
        //use
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s=editText.getText().toString();

                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                intent.putExtra("ragu",s);

                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ragu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id ;

        id = item.getItemId();
        switch (id){

            case R.id.idfile:
                Toast.makeText(this, "file selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idopen:
                Toast.makeText(this, "open selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idsave:
                Toast.makeText(this, "save selected", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
