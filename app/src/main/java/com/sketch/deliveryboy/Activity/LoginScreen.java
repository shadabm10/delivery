package com.sketch.deliveryboy.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.sketch.deliveryboy.R;

public class LoginScreen extends AppCompatActivity
        {

    DrawerLayout drawer;
    ImageView login_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);


        drawer =  findViewById(R.id.drawer_layout);
        login_img=findViewById(R.id.login_img);
        login_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(LoginScreen.this, DrawerActivity.class);
                startActivity(mainIntent);
            }
        });
        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
/*
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/




    }



}
