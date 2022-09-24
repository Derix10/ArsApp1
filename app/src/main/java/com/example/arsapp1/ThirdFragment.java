package com.example.arsapp1;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ThirdFragment extends Fragment {
    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.text_view3);
            if (getArguments().getString(SecondFragment.KEY_2).length() == 0) {
                String valu = getArguments().getString(SecondFragment.KEY3);
                textView.setText(valu);
            }
            if (getArguments().getString(SecondFragment.KEY_2).length() > 0) {
                String value = getArguments().getString(SecondFragment.KEY_2);
                textView.setText(value);
            }

    }
}