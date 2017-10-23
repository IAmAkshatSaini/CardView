package com.techoflip.navdemo.cardview;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] images = {R.drawable.beginner1, R.drawable.bodybilder, R.drawable.fitness, R.drawable.fatty};
    String[] name = {"Beginner", "BodyBuilder", "Fitness","Lose Weight"};
   // FloatingActionButton fab,fab1,fab2,fab3;
   // Animation fab_close,fab_open,rotate_backward,rotate_forward;
  //  boolean isopen=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = (ListView) findViewById(R.id.listview);
       // fab = (FloatingActionButton) findViewById(R.id.fab);
       // fab1 = (FloatingActionButton) findViewById(R.id.fab1);
       // fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        //fab3 = (FloatingActionButton) findViewById(R.id.fab3);
      //  fab_open = AnimationUtils.loadAnimation(this, R.anim.fab_open);
      //  fab_close = AnimationUtils.loadAnimation(this, R.anim.fab_close);
      //  rotate_backward = AnimationUtils.loadAnimation(this, R.anim.rotate_backward);
     //   rotate_forward = AnimationUtils.loadAnimation(this, R.anim.rotate_forward);


        listView.setAdapter(new CustomAdapter(this, name, images));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {

                    Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (i == 1) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Instruction");
                    builder.setIcon(R.drawable.bodybilder);
                    builder.setCancelable(false);
                    builder.setMessage(R.string.customdialog1);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent myIntent = new Intent(MainActivity.this, BodyBuilderActivity.class);
                            startActivityForResult(myIntent, 0);
                        }
                    });
                    builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();

                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();


                }
                if (i == 2) {

                    Intent myIntent = new Intent(MainActivity.this, FitnessActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 3) {

                    Intent myIntent = new Intent(MainActivity.this, LoseWeightActivity.class);
                    startActivityForResult(myIntent, 0);
                }


            }

        });
       /* fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();

            }
        });
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
                Intent myIntent = new Intent(MainActivity.this, BodyMassIndex.class);
               startActivity(myIntent);

            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
                Toast.makeText(MainActivity.this,"camra",Toast.LENGTH_SHORT).show();
            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();


            }
        });
    }
    private void animateFab(){
        if(isopen){
            fab.startAnimation(rotate_forward);
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            fab3.startAnimation(fab_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            fab3.setClickable(false);
            isopen=false;

        }
        else {
            fab.startAnimation(rotate_backward);
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);
            fab3.startAnimation(fab_open);
            fab1.setClickable(true);
            fab2.setClickable(true);
            fab3.setClickable(true);
            isopen=true;
        }*/
    }

    }

