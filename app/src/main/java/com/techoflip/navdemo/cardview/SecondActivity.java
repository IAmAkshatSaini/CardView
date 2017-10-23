package com.techoflip.navdemo.cardview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class  SecondActivity extends AppCompatActivity {
    String[] amin = {"First Day", "Second Day", "Third Day", "Fourth Day", "Fifth Day","Sixth Day","Seventh Day"};
    String[] name={"Chest and Shoulders", "Cardio", "Arms and Back", "Active Rest", "Legs and Abs","Chest and Shoulder","Enjoy Day"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final ListView listView = (ListView) findViewById(R.id.listview23);
        listView.setAdapter(new Exercise(this, amin,name));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {

                    Intent myIntent = new Intent(SecondActivity.this, Chest_Shoulder_Exercise.class);
                    startActivityForResult(myIntent, 0);
                }

                if (i == 1) {

                    Intent myIntent = new Intent(SecondActivity.this,Cardio.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 2) {

                    Intent myIntent = new Intent(SecondActivity.this, Arm_Back.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 3) {
                    final AlertDialog.Builder builder=new AlertDialog.Builder(SecondActivity.this);
                    builder.setTitle("Acitve Rest");
                    builder.setIcon(R.drawable.fitness);
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

                    Intent myIntent = new Intent(SecondActivity.this, Legs_And_Abs.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 5) {

                    Intent myIntent = new Intent(SecondActivity.this, Chest_Shoulder_Exercise.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });

    }
}
