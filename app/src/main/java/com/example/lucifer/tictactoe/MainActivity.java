package com.example.lucifer.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    public void strtbtn(View view){
        EditText fpn =(EditText)findViewById(R.id.editText);
        EditText spn =(EditText)findViewById(R.id.editText2);
        Button strtb = (Button)findViewById(R.id.startg);
        final String s = spn.getText().toString();
        final String f = fpn.getText().toString();
        if (s.equals("")||f.equals("")){
            TextView error=(TextView)findViewById(R.id.error);
            error.setText("Please enter players names" );
        }
        else{
            Intent game = new Intent(MainActivity.this,Main2Activity.class);
            game.putExtra("spnu",spn.getText().toString());
            game.putExtra("fpnu",fpn.getText().toString());
            startActivity(game);


        }



    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}