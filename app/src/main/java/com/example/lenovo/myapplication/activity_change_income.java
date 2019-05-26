package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lenovo.myapplication.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class activity_change_income extends AppCompatActivity {



    private Button changebtn;
    private DatabaseReference mDatabase;
    private EditText cAmount;
   // private EditText cdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_income);

        changebtn = (Button) findViewById(R.id.button8);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Income");
        cAmount = (EditText) findViewById(R.id.editText5);
       // cdate = (EditText) findViewById(R.id.editText4);

        changebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount =  cAmount.getText().toString().trim();
              //  String Date = cdate.getText().toString().trim();

                HashMap<String,String> datamap =new HashMap<String, String>();
                datamap.put("Amount",amount);
            //    datamap.put("Date",Date);

                mDatabase.setValue(datamap);
            }
        });

    }

}

