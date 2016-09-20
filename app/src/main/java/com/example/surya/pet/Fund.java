package com.example.surya.pet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class Fund extends AppCompatActivity {
    EditText salaryAmt, donationAmt, loanAmt, rewardAmt,otherAmt;
    TextView edit_date_bar_dateview;
    Date date;
    Button clear,save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fund);
        date=new Date();
        clear = (Button) findViewById(R.id.clear);
        salaryAmt = (EditText) findViewById(R.id.salaryAmt);
        donationAmt = (EditText) findViewById(R.id.donationAmt);
        loanAmt = (EditText) findViewById(R.id.loanAmt);
        rewardAmt = (EditText) findViewById(R.id.rewardAmt);
        otherAmt=(EditText)findViewById(R.id.otherAmt);
       save=(Button)findViewById(R.id.save);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                salaryAmt.setText("\0");
                donationAmt.setText("\0");
                loanAmt.setText("\0");
                rewardAmt.setText("\0");
                otherAmt.setText("\0");


            }
        });
       save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),Category.class);
                startActivity(i);
            }
        });
        edit_date_bar_dateview=(TextView) findViewById(R.id.edit_date_bar_dateview);
        edit_date_bar_dateview.setText(date.toLocaleString());
    }
}
