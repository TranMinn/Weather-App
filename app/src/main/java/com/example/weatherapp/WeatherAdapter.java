package com.example.weatherapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    private Context context;
    private ArrayList<WeatherModel> weatherModelArrayList;

    public WeatherAdapter(Context context, ArrayList<WeatherModel> weatherModelArrayList) {
        this.context = context;
        this.weatherModelArrayList = weatherModelArrayList;
    }

    @NonNull
    @Override
    public WeatherAdapter.WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hourly_forecast,parent,false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.WeatherViewHolder holder, int position) {
        
    }

    @Override
    public int getItemCount() {
        return weatherModelArrayList.size();
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTemperature;
        private ImageView ivCondition;
        public WeatherViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTemperature = itemView.findViewById(R.id.tvTemperature);
            ivCondition = itemView.findViewById(R.id.ivCondition);
        }
    }
}
