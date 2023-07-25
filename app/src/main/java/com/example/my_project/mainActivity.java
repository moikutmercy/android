package com.example.my_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myproject.NextActivity;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSaveButtonClicked(View view) {
        // Get the entered data
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextAge = findViewById(R.id.editTextAge);
        EditText editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextWeight = findViewById(R.id.editTextWeight);

        String name = editTextName.getText().toString();
        int age = Integer.parseInt(editTextAge.getText().toString());
        String phoneNumber = editTextPhoneNumber.getText().toString();
        String email = editTextEmail.getText().toString();
        String weight = editTextWeight.getText().toString();

        // Start the NextActivity and pass the data as extras
        Intent intent = new Intent(this, NextActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("age", age);
        intent.putExtra("phoneNumber", phoneNumber);
        intent.putExtra("email", email);
        intent.putExtra("weight", weight);
        startActivity(intent);
    }
}
