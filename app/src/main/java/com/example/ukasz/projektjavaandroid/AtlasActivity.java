package com.example.ukasz.projektjavaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class AtlasActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_atlas);

        findViewById(R.id.buttonKlatkaPiersiowa).setOnClickListener(this);
        findViewById(R.id.buttonPlecy).setOnClickListener(this);
        findViewById(R.id.buttonBarki).setOnClickListener(this);
        findViewById(R.id.buttonBiceps).setOnClickListener(this);
        findViewById(R.id.buttonTriceps).setOnClickListener(this);
        findViewById(R.id.buttonNogiPosladki).setOnClickListener(this);
        findViewById(R.id.buttonBrzuch).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonKlatkaPiersiowa:
                startActivity(new Intent(AtlasActivity.this, KlatkaPiersiowaActivity.class));
                break;
            case R.id.buttonPlecy:
                startActivity(new Intent(AtlasActivity.this, PlecyActivity.class));
                break;
            case R.id.buttonBarki:
                startActivity(new Intent(AtlasActivity.this, BarkiActivity.class));
                break;
            case R.id.buttonBiceps:
                startActivity(new Intent(AtlasActivity.this, BicepsActivity.class));
                break;
            case R.id.buttonTriceps:
                startActivity(new Intent(AtlasActivity.this, TricepsActivity.class));
                break;
            case R.id.buttonNogiPosladki:
                startActivity(new Intent(AtlasActivity.this, NogiPosladkiActivity.class));
                break;
            case R.id.buttonBrzuch:
                startActivity(new Intent(AtlasActivity.this, BrzuchActivity.class));
                break;
        }
    }
}
