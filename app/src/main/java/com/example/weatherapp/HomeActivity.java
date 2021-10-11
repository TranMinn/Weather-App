package com.example.weatherapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity {

    private TextView tvCityName, tvDegree, tvStatus;
    private EditText edtCityName;
    private ImageButton ibtnSearch;
    private RecyclerView rvForecast;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tvCityName = findViewById(R.id.tvCityName);
        tvDegree = findViewById(R.id.tvDegree);
        tvStatus = findViewById(R.id.tvStatus);
        edtCityName = findViewById(R.id.edtCityName);
        ibtnSearch = findViewById(R.id.ibtnSearch);
        rvForecast = findViewById(R.id.rvForecast);


    }
}
