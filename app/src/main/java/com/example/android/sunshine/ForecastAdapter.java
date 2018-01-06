package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
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

   public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
       public final TextView mWeatherTextView;


        public ForecastAdapterViewHolder(View view) {
            super(view);
            mWeatherTextView = (TextView)view.findViewById(R.id.tv_weather_data);
        }

    }



    @Override
    public ForecastAdapter.ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem,viewGroup,shouldAttachToParentImmediately);
        ForecastAdapterViewHolder viewHolder = new ForecastAdapterViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ForecastAdapter.ForecastAdapterViewHolder holder, int position) {
String weatherForThisDay = mWeatherData[position];
holder.mWeatherTextView.setText(weatherForThisDay);


    }

    @Override
    public int getItemCount() {
        if (null==mWeatherData)
        return 0;

        return mWeatherData.length;
    }
    public void setWeatherData (String[] weatherData){
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }
}
