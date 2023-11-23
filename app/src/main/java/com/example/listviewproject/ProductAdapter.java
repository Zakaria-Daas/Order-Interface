package com.example.listviewproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    Activity activity;
    int itemResourceId;
    List<Product> items;

    public ProductAdapter(Activity activity, int itemResourceId, List<Product> items){
        // super(activity, itemResourceId, items);
        this.activity = activity;
        this.itemResourceId = itemResourceId;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layout = convertView;
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            layout = inflater.inflate(itemResourceId, parent, false);
        }
        TextView nameTV = (TextView) layout.findViewById(R.id.name);
        TextView categoryTV = (TextView) layout.findViewById(R.id.category);
        TextView priceTV = (TextView) layout.findViewById(R.id.price);
        nameTV.setText(items.get(position).name);
        categoryTV.setText(items.get(position).category);
        priceTV.setText("" + items.get(position).price);
        //flagIV.setImageResource(items.get(position).flagResourceId);
        return layout;
    }
}