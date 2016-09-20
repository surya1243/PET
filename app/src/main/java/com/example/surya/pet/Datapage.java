package com.example.surya.pet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class Datapage extends AppCompatActivity {
    TextView edit_date_bar_dateview;
    Date date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datapage);
        date=new Date();
        Bundle b=getIntent().getExtras();  //bundle return gareako
        String selected=b.getString("selectedData");
        TextView selectedCategory=(TextView)findViewById(R.id.selectedCategory);
        assert selectedCategory!=null;
        selectedCategory.setText(selected);
        edit_date_bar_dateview=(TextView) findViewById(R.id.edit_date_bar_dateview);
        edit_date_bar_dateview.setText(date.toLocaleString());
    }
}
