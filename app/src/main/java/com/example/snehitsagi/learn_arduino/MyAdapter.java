package com.example.snehitsagi.learn_arduino;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] mDataset,mDataset2,mDataset3;
    Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public CardView mCardView;
        public TextView mTextView, mTextView2,mTextView3;

        public MyViewHolder(View v) {
            super(v);
            mCardView = (CardView) v.findViewById(R.id.cardview);
            mTextView = (TextView) v.findViewById(R.id.lessonno);
            mTextView2 =(TextView) v.findViewById(R.id.temp);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset, String[] myDataset2, String[] myDataset3, Context context) {
        mDataset = myDataset;
        mDataset2 = myDataset2;
        mDataset3 = myDataset3;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    /**
     * Changed by anurag, Used the context and implemented OnClickListener
     */
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.mTextView.setText(mDataset[position]);
        holder.mTextView2.setText(mDataset2[position]);
        holder.mTextView3.setText(mDataset3[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, LessonActivity.class);
                intent.putExtra("Lesson", mDataset2[position]);
                intent.putExtra("LessonNo",mDataset[position]);
                intent.putExtra("LessonContent",mDataset3[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}