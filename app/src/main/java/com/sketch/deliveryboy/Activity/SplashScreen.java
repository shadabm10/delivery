package com.sketch.deliveryboy.Activity;

/**
 * Created by developer on 7/5/18.
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.sketch.deliveryboy.R;


public class  SplashScreen extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
/*

        UpdateChecker checker = new UpdateChecker(this);
        // If you are in a Activity or a FragmentActivity

        checker.start();
*/

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms

                Intent intent = new Intent(SplashScreen.this, LoginScreen.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

    }


}
