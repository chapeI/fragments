package com.example.fragmentpractice_gitandcommented;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    private EditText hashtag;
    private Button button;  //  will refer to button in fragment a

    //  onCreateView links class to xml
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        hashtag = view.findViewById(R.id.hashtagEditField);
        button = view.findViewById(R.id.enterBtn);

        return view;
    }
}
