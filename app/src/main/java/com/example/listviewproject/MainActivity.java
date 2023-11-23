package com.example.listviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Array of strings...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        List<Product> items = new ArrayList<>();
        items.add(new Product("name", "category", 100, 20.50F));
        items.add(new Product("name2", "category2", 100, 30.50F));
        ProductAdapter adapter = new ProductAdapter(MainActivity.this, R.layout.item_product, items);

        ListView listView = (ListView) findViewById(R.id.product_list);
        listView.setAdapter(adapter);
    }
}