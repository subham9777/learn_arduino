package com.example.snehitsagi.learn_arduino;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

;

public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.notes_tab, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
/**
 * Changed by anurag, added another parameter
 */
        MyAdapter adapter = new MyAdapter(new String[]{"01", "02", "03", "04", "05" , "06" , "07"}, new String[]{"Lesson1","Lesson2","Lesson3","Lesson4","Lesson5","Lesson6","Lesson7"},new String[]{"01", "02", "03", "04", "05" , "06" , "07"}, rootView.getContext());
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

}