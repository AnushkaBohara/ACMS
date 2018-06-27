package com.example.android.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    Button View_bill = (Button) findViewById(R.id.ViewBills);
    Button Find_Store = (Button) findViewById(R.id.FindStore);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        View_bill.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Billviewintent;
                Billviewintent = new Intent(home.this, ViewBills.class);
                startActivity(Billviewintent);
                finish();
            }

        }
        );
        Find_Store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Storefindintent;
                Storefindintent= new Intent(home.this, GetLocation.class);
            }
        });
}
}

