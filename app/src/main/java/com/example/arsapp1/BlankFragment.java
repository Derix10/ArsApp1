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

public class BlankFragment extends Fragment {
  private Button button;
  private EditText editText;
  public static final String KEY = "bundle.key";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        button = view.findViewById(R.id.button);
        editText = view.findViewById(R.id.edit1);
        Bundle bundle = new Bundle();
        SecondFragment fragment = new SecondFragment();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString(KEY, editText.getText().toString());
                fragment.setArguments(bundle);
                requireActivity().
                        getSupportFragmentManager().beginTransaction().replace(R.id.conteiner, fragment).addToBackStack(null).commit();

            }
        });


    }
}