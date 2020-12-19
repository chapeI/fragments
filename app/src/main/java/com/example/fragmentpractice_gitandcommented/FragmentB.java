package com.example.fragmentpractice_gitandcommented;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    private TextView text;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        //  every fragment needs a view  (...use an inflater)
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        text = view.findViewById(R.id.textView);

        return view;
    }

    void setMyText(CharSequence c) {
        text.setText(c);
    }
}
