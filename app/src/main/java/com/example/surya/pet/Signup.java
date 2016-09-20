package com.example.surya.pet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final EditText userName, password;
        Button btnLogin = (Button) findViewById(R.id.signupButton);
        userName = (EditText) findViewById(R.id.salaryAmt);   //initializing the name textfield;
        password = (EditText) findViewById(R.id.donationAmt);
        assert btnLogin != null;
        assert userName != null;
        assert password != null;
//Intent i = new Intent(this,profile.class);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userName.getText().toString().trim().length()> 0) {
                    Intent n = new Intent();
                    n.setClass(getApplicationContext(), Signin.class);
                    Bundle data = new Bundle();
                    data.putString("uNamedisplay", userName.getText().toString());
                    n.putExtras(data);    //data pass huncha
                    startActivity(n);
                }
            }
        });
    }
}



