package com.inclass.rampalj.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] coffeeShopItem = {"Hot Drinks","Cold Drinks","Food"};
    ListView coffeeShopList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connect to List-View Resource
        coffeeShopList = findViewById(R.id.coffeeShopList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_item, coffeeShopItem);
        coffeeShopList.setAdapter(adapter);

        coffeeShopList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String [] answer_items = {"Latte","Coke","Cookie"};

                TextView text = (TextView) view;
                Toast myToast = Toast.makeText(getBaseContext(),text.getText().toString()+ " : "+ answer_items[position], Toast.LENGTH_SHORT);
                myToast.show();
            }
        });

    }
}
