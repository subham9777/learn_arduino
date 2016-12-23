package com.example.snehitsagi.learn_arduino;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private static final String LOG_TAG = "CustomAdapter";

    private String[] mDataSet;
    private String[] mDataSet2;
    private int[] mDataSetTypes;

    public static final int WEATHER = 0;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View v) {
            super(v);
        }
    }

    public class WeatherViewHolder extends ViewHolder {
        TextView temp;
        TextView lessonno;

        public WeatherViewHolder(View v) {
            super(v);
            this.temp = (TextView) v.findViewById(R.id.temp);
            this.lessonno = (TextView) v.findViewById(R.id.lessonno);
        }
    }


    public CustomAdapter(String[] dataSet, String[] dataSet2, int[] dataSetTypes) {
        mDataSet = dataSet;
        mDataSet2 = dataSet2;
        mDataSetTypes = dataSetTypes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v;
        v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        return new WeatherViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        WeatherViewHolder holder = (WeatherViewHolder) viewHolder;
        holder.temp.setText(mDataSet[position]);
        holder.lessonno.setText(mDataSet2[position]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    @Override
    public int getItemViewType(int position) {
        return mDataSetTypes[position];
    }
}