package com.example.ukasz.projektjavaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoggedInActivity extends AppCompatActivity implements View.OnClickListener {

    TextView emailDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_logged_in);

        findViewById(R.id.buttonLogout).setOnClickListener(this);
        findViewById(R.id.buttonAtlas).setOnClickListener(this);
        findViewById(R.id.buttonDziennik).setOnClickListener(this);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            String email = user.getEmail();
            email = email.toUpperCase();
            emailDisplay = (TextView) findViewById(R.id.textViewEmailDisplay);
            emailDisplay.setText(email);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonLogout:
                buttonLogoutTapped();
                break;
            case R.id.buttonAtlas:
                startActivity(new Intent(LoggedInActivity.this, AtlasActivity.class));
                break;
            case R.id.buttonDziennik:
                startActivity(new Intent(LoggedInActivity.this, DziennikActivity.class));
                break;
        }
    }

    public void buttonLogoutTapped() {
        FirebaseAuth.getInstance().signOut();
        Toast.makeText(getApplicationContext(), "Wylogowałeś się pomyślnie", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LoggedInActivity.this, MainActivity.class));
    }
}
