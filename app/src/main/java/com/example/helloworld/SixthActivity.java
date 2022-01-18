package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class SixthActivity extends AppCompatActivity {
    //code for p(6)
    private Button locationBtnL;
    private Button dateBtnL;
    private Button confirmBtnL;
    private EditText titleInp;
    private EditText descriptionInp;
    public String titleL; //title field for L-requests
    public String descriptionL; //description field for F-requests
    private boolean dateSelected; //flag to check the user selected date.
    private boolean locationSelected;//flag to check the user selected location


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_sixth);
        locationBtnL = findViewById(R.id.locationBtnLost);
        dateBtnL = findViewById(R.id.dateBtnLost);
        confirmBtnL = findViewById(R.id.confirmBtn);
        dateSelected = false;
        locationSelected = false;
    }

    //method to select location for L-requests
    public void locationSelectLost(View view) {
        //get coordinates 
        Toast.makeText(SixthActivity.this, "select location", Toast.LENGTH_SHORT).show();
        locationSelected = true;
    }

    //method when user clicks to add date for L-requests
    public void dateSelectLost(View view) {
        Toast.makeText(SixthActivity.this, "select date", Toast.LENGTH_SHORT).show();
        dateSelected = true;
    }

    //confirm button for L-requests
    public void confirmReq(View view) {
        //we identify the input fields here
        titleInp = findViewById(R.id.lostSthInp);
        descriptionInp = findViewById(R.id.dscrbInpLost);
        //and then we store the text from the user in those (after checking if empty)
        titleL = titleInp.getText().toString();
        descriptionL = descriptionInp.getText().toString();
        if (titleL.isEmpty() == true | descriptionL.isEmpty() == true) {
            //we show message to remind user to enter values .
            Toast.makeText(SixthActivity.this, "title and description are required", Toast.LENGTH_SHORT).show();
        } else if (dateSelected && locationSelected) {//check the user selected a date and a location
            //check successful
            Toast.makeText(SixthActivity.this, "Confirming Request ....", Toast.LENGTH_SHORT).show();
            //insert database code here .

        } else {
            //check failed error message to let user know to enter location and date.
            Toast.makeText(SixthActivity.this, "date and location are required", Toast.LENGTH_SHORT).show();
        }

    }
}