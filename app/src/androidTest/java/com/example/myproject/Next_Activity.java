package com.example.myproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.my_project.R;

public class Next_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        // Get the data passed from MainActivity
        String name = getIntent().getStringExtra("name");
        int age = getIntent().getIntExtra("age", 0);
        String phoneNumber = getIntent().getStringExtra("phoneNumber");
        String email = getIntent().getStringExtra("email");
        String weight = getIntent().getStringExtra("weight");

        // Display the data in TextViews
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewAge = findViewById(R.id.textViewAge);
        TextView textViewPhoneNumber = findViewById(R.id.textViewPhoneNumber);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewWeight = findViewById(R.id.textViewWeight);

        textViewName.setText("Name: " + name);
        textViewAge.setText("Age: " + age);
        textViewPhoneNumber.setText("Phone Number: " + phoneNumber);
        textViewEmail.setText("Email: " + email);
        textViewWeight.setText("Weight: " + weight);
    }
}
