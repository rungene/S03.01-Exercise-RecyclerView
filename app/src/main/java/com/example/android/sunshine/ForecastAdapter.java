package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SAM on 1/1/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {


    private String [] mWeatherData;


    public ForecastAdapter(String[] mWeatherData) {
        this.mWeatherData = mWeatherData;
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        TextView mWeatherTextView;


        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = (TextView)itemView.findViewById(R.id.tv_weather_data);
        }
    }



    @Override
    public ForecastAdapter.ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ForecastAdapter.ForecastAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
