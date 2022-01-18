package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*this activity is the title screen (screen 1) , it displays the logo (or animated logo) then moves
    on to the next screen (2) */
    private ImageView logo;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.logoPng);
        logo.setVisibility(View.VISIBLE);
        title = findViewById(R.id.titletxt);
        title.setVisibility(View.VISIBLE);
        hideAfterDelay();
    }

    private void hideAfterDelay() {
        //So now we wait two seconds and hide the logo and title with a fadeout animation.
        final Handler handler = new Handler();
        int j =0;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 2s = 2000ms
                //this is a fadeout animation for the logo
                ObjectAnimator fadeOutLogo = ObjectAnimator.ofFloat(logo, "alpha", 1f, 0);
                fadeOutLogo.setDuration(500);
                fadeOutLogo.start();
                //this is a fadeout animation for the title.
                ObjectAnimator fadeOutTitle = ObjectAnimator.ofFloat(title, "alpha", 1f, 0);
                fadeOutTitle.setDuration(500);
                fadeOutTitle.start();
                //we define an intent to transtiton into the second screen , (it's set to 5th activity for testing)
                Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                //then we launch the second screen.
                startActivity(intent);
            }
        }, 2000);

    }
}