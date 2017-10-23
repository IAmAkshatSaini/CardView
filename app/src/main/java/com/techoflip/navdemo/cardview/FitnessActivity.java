package com.techoflip.navdemo.cardview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class FitnessActivity extends AppCompatActivity {
       String[] amen = {"First Day", "Second Day", "Third Day", "Fourth Day", "Fifth Day","Sixth Day"};
    String[] amin = {"Chest", "Shoulders", "Legs and abs", "Active Rest", "Back","Arms","Enjoy Day"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
        final ListView listView = (ListView) findViewById(R.id.fitness1);
        listView.setAdapter(new Fitness(this, amen,amin));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {

                    Intent myIntent = new Intent(FitnessActivity.this, Chest.class);
                    startActivityForResult(myIntent, 0);
                }

                if (i == 1) {

                    Intent myIntent = new Intent(FitnessActivity.this, Shoulder.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 2) {

                    Intent myIntent = new Intent(FitnessActivity.this, Legs_Abs3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 3) {
                    final AlertDialog.Builder builder=new AlertDialog.Builder(FitnessActivity.this);
                    builder.setTitle("Instruction");
                    builder.setIcon(R.drawable.bodybilder);
                    builder.setCancelable(false);
                    builder.setMessage("Involves performing light exercises (often swimming or cycling) that stimulate the recovery process without imposing undue stress on the injured body part.");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });

                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();


                }
                if (i == 4) {
                    Intent myIntent = new Intent(FitnessActivity.this, Back.class);
                    startActivityForResult(myIntent, 0);

                }
                if(i==5){
                    Intent myIntent = new Intent(FitnessActivity.this, Arms.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });

    }
}
