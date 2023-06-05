package com.example.giftchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class Second extends AppCompatActivity {
    private EditText age;
    private EditText gender;
    private EditText cash;
    private ImageButton buttonNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Инициализация переменных
        age = findViewById(R.id.ageEditView);
        gender = findViewById(R.id.genderEditView);
        cash = findViewById(R.id.cashEditView);
        buttonNext = findViewById(R.id.buttonNext);

        String AGEstr = age.getText().toString();
        String GENDERstr = gender.getText().toString();
        String CASHstr = cash.getText().toString();

        Intent intentSec = new Intent(getApplicationContext(), listOfPresent.class);
    }
}