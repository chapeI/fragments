package com.example.fragmentpractice_gitandcommented;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.FragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void fragmentToActivity(CharSequence input) {

        //  connect to fragment_b
        FragmentB fragmentB = (FragmentB) getSupportFragmentManager()
                .findFragmentById(R.id.fragment2);

        //  great, now invoke fragment_b methods
        fragmentB.setMyText(input);
        System.out.println(input);
    }
}