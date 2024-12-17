package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class activity_signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        findViewById(R.id.btnRegister).setOnClickListener(view -> {
            Intent intent = new Intent(activity_signup.this, activity_login.class);
            startActivity(intent);
            finish();
        });
    }
}
