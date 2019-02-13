package com.example.ukasz.projektjavaandroid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextEmail, editTextPassword;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonLogin).setOnClickListener(this);
        findViewById(R.id.buttonCreateAccount).setOnClickListener(this);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.buttonLogin:
                buttonLoginTapped();
                break;
            case R.id.buttonCreateAccount:
                buttonCreateAccountTapped();
                break;
        }
    }

    public void buttonCreateAccountTapped() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if(email.isEmpty()) {
            editTextEmail.setError("Pole jest puste");
            editTextEmail.requestFocus();
            return;
        }

        if(password.isEmpty()) {
            editTextPassword.setError("Pole jest puste");
            editTextPassword.requestFocus();
            return;
        }

        if(password.length() < 6) {
            editTextPassword.setError("Hasło musi posiadać co najmniej 6 znaków");
        }

        startActivity(new Intent(MainActivity.this, LoggedInActivity.class));

//        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), "Użytkownik zarejestrowany pomyślnie", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(MainActivity.this, LoggedInActivity.class));
//                } else {
//                    Toast.makeText(getApplicationContext(), "Uwierzytelnianie zakończone niepowodzeniem", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }

    public void buttonLoginTapped() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if(email.isEmpty()) {
            editTextEmail.setError("Pole jest puste");
            editTextEmail.requestFocus();
            return;
        }

        if(password.isEmpty()) {
            editTextPassword.setError("Pole jest puste");
            editTextPassword.requestFocus();
            return;
        }

        if(password.length() < 6) {
            editTextPassword.setError("Hasło musi posiadać co najmniej 6 znaków");
        }

        startActivity(new Intent(MainActivity.this, LoggedInActivity.class));

//        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), "Użytkownik zalogowany pomyślnie", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(MainActivity.this, LoggedInActivity.class));
//                } else {
//                    Toast.makeText(getApplicationContext(), "Uwierzytelnianie zakończone niepowodzeniem", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
}
