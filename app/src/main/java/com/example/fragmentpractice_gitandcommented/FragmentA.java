package com.example.fragmentpractice_gitandcommented;

import android.app.Activity;
import android.content.Context;
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
    FragmentListener listener;

    //  your activity listens to fragment ie. getting input
    //  this is how to connect your fragment to the activity

    public interface FragmentListener {  // your telling your activity, it is a fragment listener
        public void fragmentToActivity(CharSequence input);
    }

    @Override
    public void onAttach(@NonNull Activity activity) {      //  fragment is connected to activity
        super.onAttach(activity);                           //  fragment is 'attached' to activity
        listener = (FragmentListener) activity;             //  your listener IS activity
    }                                                       //  fragment can send data

    //  onCreateView links class to xml
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        hashtag = view.findViewById(R.id.hashtagEditField);
        button = view.findViewById(R.id.enterBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence input = hashtag.getText();
                listener.fragmentToActivity(input);
            }
        });

        return view;
    }
}
