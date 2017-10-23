package com.techoflip.navdemo.cardview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import at.markushi.ui.CircleButton;

public class BodyMassIndex extends AppCompatActivity {
    EditText height,weight,age;
      CircleButton btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_mass_index);

        height=(EditText)findViewById(R.id.height);
       weight=(EditText)findViewById(R.id.weight);
        age=(EditText)findViewById(R.id.age);
        btn=(CircleButton)findViewById(R.id.button);
        result=(TextView)findViewById(R.id.result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result=" ";
                int feet;
                try {
                    feet = Integer.parseInt(height.getText().toString());
                    if (feet<30||feet>300){
                        height.setError("between 30 and 300!");
                    }
                }
                catch(Exception ex){
                    Context context = getApplicationContext();
                    CharSequence text="FEET was empty!";
                    int duration= Toast.LENGTH_SHORT;
                    Toast toast=Toast.makeText(context,text,duration);
                    toast.show();
                }

                try {
                    int weight1 = Integer.parseInt(weight.getText().toString());
                    if (weight1<=3||weight1>250){
                        weight.setError("weight must be in between 3 and 250!");
                    }
                }
                catch(Exception ex){
                    Context context = getApplicationContext();
                    CharSequence text="weight was Empty!";
                    int duration= Toast.LENGTH_SHORT;
                    Toast toast=Toast.makeText(context,text,duration);
                    toast.show();
                }
                try {
                    int ages = Integer.parseInt(age.getText().toString());
                    if (ages<=1||ages>80){
                        age.setError("age must be in between 1 and 80!");
                    }
                }
                catch(Exception ex){
                    Context context = getApplicationContext();
                    CharSequence text="age was Empty!";
                    int duration= Toast.LENGTH_SHORT;
                    Toast toast=Toast.makeText(context,text,duration);
                    toast.show();
                }
                calculateBMI(view);


            }
        });


    }
    public void calculateBMI(View view){
        String height2=height.getText().toString();
        String weight1=weight.getText().toString();
        if(height2!=null&&!"".equals(height2)
                &&weight1!=null&&!"".equals(weight1)){
            float heightvalue=Integer.parseInt(height2);

            int weightvalue=Integer.parseInt(weight1);
            float  bmi=(weightvalue/(heightvalue*heightvalue));
            displayBMI( bmi);
        }
    }
    private void  displayBMI(float bmi){
        String bmiLabel="";
        if(Float.compare(bmi,15f)<=0){
            bmiLabel=getString(R.string.very_severely_underweight);

        }else if(Float.compare(bmi,15f)>0 && Float.compare(bmi,16f)<=0){
            bmiLabel=getString(R.string.very_severely_underweight1);
        }
        else if(Float.compare(bmi,16f)>0 && Float.compare(bmi,18.5f)<=0){
            bmiLabel=getString(R.string.Underweight);
        }
        else if(Float.compare(bmi,18.5f)>0 && Float.compare(bmi,25f)<=0){
            bmiLabel=getString(R.string.Normal);
        }
        else if(Float.compare(bmi,25f)>0 && Float.compare(bmi,30f)<=0){
            bmiLabel=getString(R.string.Overweight);
        }
        else if(Float.compare(bmi,30f)>0 && Float.compare(bmi,35f)<=0){
            bmiLabel=getString(R.string.obese_class1);
        }
        else if(Float.compare(bmi,35f)>0 && Float.compare(bmi,40f)<=0){
            bmiLabel=getString(R.string.obese_class2);
        }

        else {
            bmiLabel=getString(R.string.obese_class3);
        }
        bmiLabel=bmi+"\n\n"+ bmiLabel;
        result.setText(bmiLabel);
    }
}
