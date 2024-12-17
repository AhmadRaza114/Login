package com.example.login;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.Fragment.SavedState;
import androidx.fragment.app.Fragment.SavedState;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.fragmentOne).setOnClickListener(view -> {
            loadFragment(new Fragment_one());
        });

        findViewById(R.id.fragmentTwo).setOnClickListener(view -> {
            loadFragment(new fragment_two());
        });
        findViewById(R.id.fragmentThree).setOnClickListener(view -> {
            loadFragment(new fragment_three());
        });

        // Load default fragment
        loadFragment(new Fragment_one());

    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();


    }
}


