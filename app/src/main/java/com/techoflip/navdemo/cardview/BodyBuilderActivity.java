package com.techoflip.navdemo.cardview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BodyBuilderActivity extends AppCompatActivity {
    String[] amen = {"First Day", "Second Day", "Third Day", "Fourth Day", "Fifth Day","Sixth Day","Enjoy Day"};
    String[] amin = {"Back,Shoulders and Abs", "Rest", "Legs and Abs", "Active Rest", "Chest and Arms","Rest","Enjoy Day"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_builder);
        final ListView listView = (ListView) findViewById(R.id.listview234);
        listView.setAdapter(new BodyBuilder(this, amen,amin));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {

                    Intent myIntent = new Intent(BodyBuilderActivity.this, Back_Shoulder_Abs.class);
                    startActivityForResult(myIntent, 0);
                }

                if (i == 1) {
                    final AlertDialog.Builder builder=new AlertDialog.Builder(BodyBuilderActivity.this);
                    builder.setTitle("Instruction");
                    builder.setIcon(R.drawable.bodybilder);
                    builder.setCancelable(false);
                    builder.setMessage("On these days, the only thing your going to be doing is resting. Do not go into the gym or do any sort of\n" +
                            "  exercise. What you want to do is allow your muscles to rest and to recover because this is the time to build\n" +
                            "  muscle. \n" +
                            "\n" +
                            "  Eat plenty of quality nutrients and get plenty of rest. ");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                          dialogInterface.dismiss();
                        }
                    });

                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();






                }
                if (i == 2) {

                    Intent myIntent = new Intent(BodyBuilderActivity.this,Legs_Abs1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 3) {
                    final AlertDialog.Builder builder=new AlertDialog.Builder(BodyBuilderActivity.this);
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

                    Intent myIntent = new Intent(BodyBuilderActivity.this, Chest_Arms.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 5) {
                    final AlertDialog.Builder builder=new AlertDialog.Builder(BodyBuilderActivity.this);
                    builder.setTitle("Instruction");
                    builder.setIcon(R.drawable.bodybilder);
                    builder.setCancelable(false);
                    builder.setMessage("On these days, the only thing your going to be doing is resting. Do not go into the gym or do any sort of\n" +
                            "  exercise. What you want to do is allow your muscles to rest and to recover because this is the time to build\n" +
                            "  muscle. \n" +
                            "\n" +
                            "  Eat plenty of quality nutrients and get plenty of rest. ");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });

                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();





                }


            }
        });

    }
}


