package com.example.surya.pet;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;




public class ImageAdapter extends BaseAdapter {
    Context context;
    ArrayList<CategoryMenu> list;

    ImageAdapter(Context context)
    {
        this.context=context;
         list= new  ArrayList<CategoryMenu>();

       Resources res = context.getResources();
        String[] category_name=res.getStringArray(R.array.category);
        int[] categoryImg={  R.drawable.food,
                R.drawable.shirt,
                R.drawable.bus,
                R.drawable.education,
                R.drawable.gadget,
                R.drawable.game,
                R.drawable.medical,
                R.drawable.living,


                R.drawable.grocery,
                R.drawable.phone,
                R.drawable.gift,
                R.drawable.other
        };
        for(int i=0;i<categoryImg.length;i++)
        {
            CategoryMenu categoryMenu=new  CategoryMenu(categoryImg[i],category_name[i]);
            list.add(categoryMenu);
        }
    }



    public int getCount() {
        return list.size();
    }

    public Object getItem(int position) {
        return list.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        ViewHolder holder=null;
        if(row==null)
        {
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_layout,parent,false);
            holder=new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {

            holder=(ViewHolder)row.getTag();
        }
        CategoryMenu temp=list.get(position);
        holder.pic.setImageResource(temp.imgId);
        holder.desc.setText(temp.imgDesc);

        return row;
    }



    }
class ViewHolder{
    ImageView pic;
    TextView desc;
    ViewHolder(View v)
    {
        pic=(ImageView) v.findViewById(R.id.dispalyImg);
        desc=(TextView) v.findViewById(R.id.picDesc);
    }
}