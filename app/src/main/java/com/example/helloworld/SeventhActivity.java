package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SeventhActivity extends AppCompatActivity {
    //code for p(7)
    private Button locationBtnF;
    private Button dateBtnF;
    private Button confirmBtnF;
    private EditText titleInpF;
    private EditText descriptionInpF;

    public String titleF; //title field for L-requests
    public String descriptionF; //description field for F-requests

    private boolean dateSelected; //flag to check the user selected date.
    private boolean locationSelected;//flag to check the user selected location

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_seventh);
        dateSelected = false;
        locationSelected = false;
        //linking the buttons to the UI buttons
        locationBtnF = findViewById(R.id.locationBtnFound);
        dateBtnF = findViewById(R.id.dateBtnFound);
        confirmBtnF =findViewById(R.id.confirmBtn);
        titleInpF=findViewById(R.id.foundSthInp);
        descriptionInpF=findViewById(R.id.dscrbInpFound);


    }

    //method to get location for f-requests
    public void locationSelectFound(View view) {
        //code that gets the user's current location
        Toast.makeText(SeventhActivity.this, "select location", Toast.LENGTH_SHORT).show();
        locationSelected = true;

    }

    //method to select date for L-requests
    public void dateSelectFound(View view) {
        //code that opens the date picker dialog
        Toast.makeText(SeventhActivity.this, "select date", Toast.LENGTH_SHORT).show();
        dateSelected = true;

    }

    //confirm button for f-requests
    public void confirmReqFound(View view) {

        //and then we store the text from the user in those (after checking if empty)
        titleF = titleInpF.getText().toString();
        descriptionF = descriptionInpF.getText().toString();
        if (titleF.isEmpty() == true | descriptionF.isEmpty() == true) {
            //we show message to remind user to enter values .
            Toast.makeText(SeventhActivity.this, "title and description are required", Toast.LENGTH_SHORT).show();
        } else if (dateSelected && locationSelected) {//check the user selected a date and a location
            //check successful
            Toast.makeText(SeventhActivity.this, "Confirming Request ....", Toast.LENGTH_SHORT).show();
            //insert database code here .

        } else {
            //check failed error message to let user know to enter location and date.
            Toast.makeText(SeventhActivity.this, "date and location are required", Toast.LENGTH_SHORT).show();
        }

    }
}