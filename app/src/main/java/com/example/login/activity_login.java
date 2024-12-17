package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.login.MainActivity;
import com.example.login.activity_signup;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btnLogin).setOnClickListener(view -> {
            Intent intent = new Intent(activity_login.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        findViewById(R.id.tvSignup).setOnClickListener(view -> {
            Intent intent = new Intent(activity_login.this, activity_signup.class);
            startActivity(intent);
        });
    }
}
