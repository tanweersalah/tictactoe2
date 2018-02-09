



package com.example.lucifer.tictactoe;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    int w = 5;
    int z = 0;
    int[] intial = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    int not = 0;
    public void win(){
        final String first = getIntent().getStringExtra("fpnu");
        final String second = getIntent().getStringExtra("spnu");

        TextView turn = (TextView)findViewById(R.id.turn);
        if (w==0) {
            turn.setText(second + " won");
            String winner = second + " won";
            Toast.makeText(Main2Activity.this,winner,Toast.LENGTH_LONG).show();


        }
        else if(w==1){

            turn.setText(first + " won");
            String winner = first + " won";
            Toast.makeText(Main2Activity.this,winner,Toast.LENGTH_LONG).show();
        }

    }


    public void validate(){


        if (intial[1]==1&&intial[5]==1&&intial[9]==1){
            ImageView d159=(ImageView)findViewById(R.id.d159);
            d159.animate().alpha(1);

            w = 0;
            win();

        }
        else if (intial[1]==1&&intial[2]==1&&intial[3]==1){
            ImageView h123=(ImageView)findViewById(R.id.h123);
            h123.animate().alpha(1);

            w = 0;
            win();

        }
        else if (intial[6]==1&&intial[4]==1&&intial[5]==1){
            ImageView h456=(ImageView)findViewById(R.id.h456);
            h456.animate().alpha(1);

            w = 0;
            win();}
        else if (intial[7]==1&&intial[8]==1&&intial[9]==1){
            ImageView h789=(ImageView)findViewById(R.id.h789);
            h789.animate().alpha(1);
            w = 0;
            win();
        }
        else if (intial[1]==1&&intial[4]==1&&intial[7]==1){
            ImageView v147=(ImageView)findViewById(R.id.v147);
            v147.animate().alpha(1);
            w = 0;
            win();
        }
        else if (intial[2]==1&&intial[5]==1&&intial[8]==1){
            ImageView v258=(ImageView)findViewById(R.id.v258);
            v258.animate().alpha(1);
            w = 0;
            win();
        }
        else if (intial[3]==1&&intial[6]==1&&intial[9]==1){
            ImageView v369=(ImageView)findViewById(R.id.v369);
            v369.animate().alpha(1);
            w = 0;
            win();
        }
        else if (intial[3]==1&&intial[5]==1&&intial[7]==1){
            ImageView d357=(ImageView)findViewById(R.id.d357);
            d357.animate().alpha(1);
            w = 0;
            win();
        }
        else if (intial[1]==0&&intial[5]==0&&intial[9]==0){
            ImageView d159=(ImageView)findViewById(R.id.d159);
            d159.animate().alpha(1);
            w = 1;
            win();

        }
        else if (intial[1]==0&&intial[2]==0&&intial[3]==0){
            ImageView h123=(ImageView)findViewById(R.id.h123);
            h123.animate().alpha(1);
            w = 1;
            win();
        }
        else if (intial[6]==0&&intial[4]==0&&intial[5]==0){
            ImageView h456=(ImageView)findViewById(R.id.h456);
            h456.animate().alpha(1);
            w = 1;
            win();
        }
        else if (intial[7]==0&&intial[8]==0&&intial[9]==0){
            ImageView h789=(ImageView)findViewById(R.id.h789);
            h789.animate().alpha(1);
            w = 1;
            win();
        }
        else if (intial[1]==0&&intial[4]==0&&intial[7]==0){
            ImageView v147=(ImageView)findViewById(R.id.v147);
            v147.animate().alpha(1);
            w = 1;
            win();
        }
        else if (intial[2]==0&&intial[5]==0&&intial[8]==0){
            ImageView v258=(ImageView)findViewById(R.id.v258);
            v258.animate().alpha(1);
            w = 1;
            win();
        }
        else if (intial[3]==0&&intial[6]==0&&intial[9]==0){
            ImageView v369=(ImageView)findViewById(R.id.v369);
            v369.animate().alpha(1);
            w = 1;
            win();
        }
        else if (intial[3]==0&&intial[5]==0&&intial[7]==0){
            ImageView d357=(ImageView)findViewById(R.id.d357);
            d357.animate().alpha(1);
            w = 1;
            win();
        }







    }

    public void tap(View view) {
        final String first = getIntent().getStringExtra("fpnu");
        final String second = getIntent().getStringExtra("spnu");

        TextView turn = (TextView)findViewById(R.id.turn);

        ImageView i = (ImageView) view;
        int tag = Integer.parseInt(i.getTag().toString());
        if (intial[tag] == 2) {
            intial[tag] = z;


            if (z == 0 && not != 9) {
                i.setImageResource(R.drawable.cross);
                i.animate().rotationBy(360).setDuration(1000);
                turn.setText(second +"'s turn");
                z = 1;
                not++;
                validate();
            } else if (z == 0 && not == 9) {
                i.setImageResource(R.drawable.cross);
                i.animate().rotationBy(360).setDuration(1000);
                turn.setText("Game Ends");
                z = 1;
            } else if (z == 1 && not == 9) {
                i.setImageResource(R.drawable.circle);

                i.animate().alpha(1).setDuration(3000);
                turn.setText("Game Ends");
                z = 0;}

            else{
                i.setImageResource(R.drawable.circle);

                i.animate().alpha(1).setDuration(3000);
                turn.setText(first+"'s turn");
                z = 0;
                not++;
                validate();
            }
        }

    }
    public void replay(View view){
        Intent restart = new Intent(Main2Activity.this,Main2Activity.class);
        restart.putExtra("spnu",getIntent().getStringExtra("spnu"));
        restart.putExtra("fpnu",getIntent().getStringExtra("fpnu"));
        startActivity(restart);

    }







    @Override protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
