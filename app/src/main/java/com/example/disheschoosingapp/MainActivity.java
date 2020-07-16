package com.example.disheschoosingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   CheckBox c1,c2,c3,c4,c5;
   Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        c5=findViewById(R.id.checkBox5);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_amount=0;
                String result="";
                result+=" Selected Dishes: ";
                if(c1.isChecked())
                {   result+=" \n Chicken,";
                    total_amount+=50;

                } if(c2.isChecked())
                {   result+=" \n Paneer,";
                    total_amount+=100;

                } if(c3.isChecked())
                {   result+=" \n CupCake,";
                    total_amount+=150;

                } if(c4.isChecked())
                {   result+=" \n Matar Paneer,";
                    total_amount+=250;

                } if(c5.isChecked())
                {   result+=" \n PanCake are  selected";
                    total_amount+=550;

                }
                result+="\n"+"Total"+total_amount+"Rs.";
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

    }
}