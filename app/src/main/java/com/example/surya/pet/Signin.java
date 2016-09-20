package com.example.surya.pet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        Bundle b=getIntent().getExtras();  //bundle return gareako
        String username=b.getString("uNamedisplay");
        TextView txtUsername=(TextView)findViewById(R.id.uNamedisplay);
        assert txtUsername!=null;
        txtUsername.setText("Welcome "+username);
        Button confirmButton=(Button)findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent();
                n.setClass(getApplicationContext(), Fund.class);
                startActivity(n);
            }
        });
    }
}