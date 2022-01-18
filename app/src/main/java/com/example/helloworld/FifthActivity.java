package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {
    private Button lostSthBtn;
    private Button foundSthBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        lostSthBtn = findViewById(R.id.lostSthBtn);
        foundSthBtn = findViewById(R.id.foundSthBtn);
        setContentView(R.layout.activity_fifth);

    }

    //method executes when user taps on the first button in p (5)
    public void lostSthClicked(View view) {
        //p(6) is displayed using this block
        //we define an intent to transtiton into the sixth screen ,
        Intent intent = new Intent(FifthActivity.this, SixthActivity.class);
        //then we launch the seventh screen.
        startActivity(intent);
    }

    //method execustes when user taps on the second button in p (5).
    public void foundSthClicked(View view) {
    //p(7) is displayed using this block.
        //we define an intent to transtiton into the seventh screen ,
        Intent intent = new Intent(FifthActivity.this, SeventhActivity.class);
        //then we launch the seventh screen.
        startActivity(intent);
    }
}