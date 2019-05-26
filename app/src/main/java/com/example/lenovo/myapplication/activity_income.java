package com.example.lenovo.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class activity_income extends AppCompatActivity {

    private Button mFirebasebtn;
    private DatabaseReference mDatabase;
    private EditText mAmount;
    private EditText mDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

        mFirebasebtn = (Button) findViewById(R.id.firebase_btn);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Income");
        mAmount = (EditText) findViewById(R.id.editText3);
     //   mDate = (EditText) findViewById(R.id.editText);

        mFirebasebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String amount =  mAmount.getText().toString().trim();
               // String Date = mDate.getText().toString().trim();
                Toast.makeText(activity_income.this, " ADDED", Toast.LENGTH_SHORT).show();
                HashMap<String,String> datamap =new HashMap<String, String>();
                datamap.put("Amount",amount);
              //  datamap.put("Date",Date);

                mDatabase.setValue(datamap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                        if(task.isSuccessful())
                        {
                            Toast.makeText(activity_income.this,"Stored",Toast.LENGTH_LONG).show();
                        }else
                        {
                            Toast.makeText(activity_income.this,"Error",Toast.LENGTH_LONG).show();
                        }


                    }
                });


            }
        });


    }
}
