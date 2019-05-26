package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Add_income,Add_expenditure,Change_income,Change_expenditure,Balance,Show_income;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Add_income=(Button)findViewById(R.id.button);
        Add_expenditure=(Button)findViewById(R.id.button2);
        Change_income=(Button)findViewById(R.id.button3);

        Balance=(Button)findViewById(R.id.button5);
        Show_income = (Button) findViewById(R.id.button6);
       // All_transaction=(Button)findViewById(R.id.button6);


        Add_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,activity_income.class);
            //  Toast.makeText(MainActivity.this, " mein", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        Add_expenditure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(MainActivity.this, activity_expenditure.class);
               // Toast.makeText(MainActivity.this, "abc", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        Change_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(MainActivity.this,activity_change_income.class);
                startActivity(i);
  //              Toast.makeText(MainActivity.this, "om", Toast.LENGTH_SHORT).show();
            }



        });

        Balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          Intent i=new Intent(MainActivity.this,activity_balance.class);
               startActivity(i);
             //   Toast.makeText(MainActivity.this, "pr", Toast.LENGTH_SHORT).show();
            }



        });

        Show_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,show_income.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Working", Toast.LENGTH_SHORT).show();

            }
        });







    }
}
