package com.example.giftchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class list_categoriesOfPeople extends AppCompatActivity {
   private ImageButton child_1_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_categories_of_people);
        child_1_3 = findViewById(R.id.button);
    }
    private View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(getApplicationContext(),list_present1.class);
            startActivity(intent);
        }
    };
}