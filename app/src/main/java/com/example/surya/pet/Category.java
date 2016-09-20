package com.example.surya.pet;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

public class Category extends AppCompatActivity {
    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        GridView gridview = (GridView) findViewById(R.id.categoryGridview);
        gridview.setAdapter((ListAdapter) new ImageAdapter(getApplicationContext()));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

               // Toast.makeText(Category.this, "" + position,Toast.LENGTH_SHORT).show();
                switch(position)
                {
                    case 0:
                        selected="Food";
                        break;
                    case 1:
                        selected="Clothing";
                        break;
                    case 2:
                        selected="Transportation";
                        break;
                    case 3:
                        selected="Education";
                        break;
                    case 4:
                        selected="Gadget";
                        break;
                    case 5:
                        selected="Entertainment";
                        break;
                    case 6:
                        selected="Medical";
                        break;
                    case 7:
                        selected="Living";
                        break;
                    case 8:
                        selected="Grocery";
                        break;
                    case 9:
                        selected="Communication";
                        break;
                    case 10:
                        selected="Gift";
                        break;
                    case 11:
                        selected="Other";
                        break;
                }
                Intent n = new Intent();
                n.setClass(getApplicationContext(),Datapage.class);
                Bundle data = new Bundle();
                data.putString("selectedData",selected);
                n.putExtras(data);    //data pass huncha
                startActivity(n);
            }
        });
    }

}
class CategoryMenu
{
    int imgId;
    String imgDesc;
    CategoryMenu(int imgId,String imgDesc)
    {
        this.imgId=imgId;
        this.imgDesc=imgDesc;
    }
}
