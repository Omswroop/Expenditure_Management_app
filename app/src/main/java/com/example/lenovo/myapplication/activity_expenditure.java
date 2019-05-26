package com.example.lenovo.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;

        import java.util.HashMap;

public class activity_expenditure extends AppCompatActivity {


    private Button Food,Entertainment,Health,other;
    private DatabaseReference mDatabase;
    private EditText dfood,afood,denter,aenter,dhealth,ahealth,dother,aother;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenditure);

        Food = (Button) findViewById(R.id.button12);
        Entertainment = (Button) findViewById(R.id.button13);
        Health = (Button) findViewById(R.id.button14);
        other = (Button) findViewById(R.id.button15);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Expenditure");

        dfood = (EditText) findViewById(R.id.editText2);
        //dfood =  (EditText) findViewById(R.id.edi)
        afood = (EditText) findViewById(R.id.editText9);
        denter = (EditText) findViewById(R.id.editText10);
        aenter = (EditText) findViewById(R.id.editText11);
        dhealth = (EditText) findViewById(R.id.editText12);
        ahealth = (EditText) findViewById(R.id.editText13);
        dother = (EditText) findViewById(R.id.editText15);
        aother = (EditText) findViewById(R.id.editText16);

        Food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String Fooddt = dfood.getText().toString().trim();
                String Foodamt = afood.getText().toString().trim();

                HashMap<String,String> datamap= new HashMap<String,String>();
                datamap.put("Food Date",Fooddt);
                datamap.put("Food Amount",Foodamt);
                Toast.makeText(activity_expenditure.this, " ADDED TO FOOD", Toast.LENGTH_SHORT).show();
                mDatabase.push().setValue(datamap);


            }
        });


        Entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String enterdt = denter.getText().toString().trim();
                String enteramt = aenter.getText().toString().trim();

                HashMap<String,String> datamap= new HashMap<String,String>();
                datamap.put("Entertainment Date",enterdt);
                datamap.put("Entertainment Amount",enteramt);
                Toast.makeText(activity_expenditure.this, " ADDED TO ENTERTAINMENT", Toast.LENGTH_SHORT).show();
                mDatabase.push
                        ().setValue(datamap);


            }
        });



        Health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String healthdt = dhealth.getText().toString().trim();
                String healthamt = ahealth.getText().toString().trim();

                HashMap<String,String> datamap= new HashMap<String,String>();
                datamap.put("health Date",healthdt);
                datamap.put("health Amount",healthamt);
                Toast.makeText(activity_expenditure.this, " ADDED TO HEALTH", Toast.LENGTH_SHORT).show();
                mDatabase.push
                        ().setValue(datamap);


            }
        });


        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String otherdt = dother.getText().toString().trim();
                String otheramt = aother.getText().toString().trim();

                HashMap<String,String> datamap= new HashMap<String,String>();
                datamap.put("other Date",otherdt);
                datamap.put("other Amount",otheramt);
                Toast.makeText(activity_expenditure.this, " ADDED TO OTHER", Toast.LENGTH_SHORT).show();
                mDatabase.push
                        ().setValue(datamap);


            }
        });







    }

}

