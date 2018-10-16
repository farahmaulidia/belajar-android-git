package com.aderufaidah.simpleapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SecondFragment extends Fragment {
    private Button buttonDua;



//title bar atau action bar

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        ((WithFragment) getActivity()).getSupportActionBar().setTitle("Fragment");
        ((WithFragment) getActivity()).getSupportActionBar().setSubtitle("Second Fragment");
        ((WithFragment)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        return view;

    }

    @Override
    //tombol back
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);



    }

    //end of title bar atau action bar




}
