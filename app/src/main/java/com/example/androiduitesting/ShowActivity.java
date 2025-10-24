package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView tvCity = findViewById(R.id.text_city_name);
        Button btnBack = findViewById(R.id.button_back);

        Intent intent = getIntent();
        String city = intent.getStringExtra(EXTRA_CITY_NAME);
        if (city != null) {
            tvCity.setText(city);
        } else {
            tvCity.setText(""); // safe default
        }

        btnBack.setOnClickListener(v -> finish()); // returns to MainActivity
    }
}
