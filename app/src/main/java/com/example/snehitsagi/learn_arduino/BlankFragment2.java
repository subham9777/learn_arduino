package com.example.snehitsagi.learn_arduino;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

;

public class BlankFragment2 extends Fragment {

    public BlankFragment2() {
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
        View rootView = inflater.inflate(R.layout.test_tab, container, false);

        RecyclerView rv2 = (RecyclerView) rootView.findViewById(R.id.recyclerView2);
        rv2.setHasFixedSize(true);
        MyAdapter adapter2 = new MyAdapter(new String[]{"01", "02", "03", "04", "05" , "06" , "07"}, new String[]{"Test1","Test2","Test3","Test4","Test5","Test6","Test7"});
        rv2.setAdapter(adapter2);

        LinearLayoutManager llm2 = new LinearLayoutManager(getActivity());
        rv2.setLayoutManager(llm2);

        return rootView;
    }

}