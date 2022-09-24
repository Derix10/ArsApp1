package com.example.arsapp1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondFragment extends Fragment {
private TextView textView;
private EditText editText;
private Button button1;
public static final String KEY_2 = "bundle.key2", KEY3 = "bundle.key3";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.textnum1);
        editText = view.findViewById(R.id.edit2);
        Bundle bundle = new Bundle();
        ThirdFragment fragment = new ThirdFragment();
        button1 = view.findViewById(R.id.button1);


        if (getArguments() != null){
            String value = getArguments().getString(BlankFragment.KEY);
            textView.setText(value);
        }


        button1.setOnClickListener(view1 -> {
            bundle.putString(KEY3, textView.getText().toString());
            bundle.putString(KEY_2, editText.getText().toString());
            fragment.setArguments(bundle);

            requireActivity().
                    getSupportFragmentManager().beginTransaction().replace(R.id.conteiner, fragment).addToBackStack(null).commit();


        });
    }
}