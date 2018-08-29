package com.example.presly.eventlistenerinsideactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //locate both buttons
        Button sButton = (Button)findViewById(R.id.btn_s);
        Button lButton = (Button)findViewById(R.id.btn_l);

        //register click events with first button
        sButton.setOnClickListener(this);
        //register click events with second button
        lButton.setOnClickListener(this);
    }

    //--- implement the onclicklistener callback
    public void onClick(View v){
        if(v.getId() == R.id.btn_s){
            //find the text view
            TextView txtView = (TextView)findViewById(R.id.text_id);
            //change the text size
            txtView.setTextSize(14);
            return;
        }
        if (v.getId() == R.id.btn_l){
            //find textview
            TextView txtView = (TextView)findViewById(R.id.btn_l);
            //change text size
            txtView.setTextSize(24);
            return;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}