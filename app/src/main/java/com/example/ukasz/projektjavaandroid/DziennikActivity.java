package com.example.ukasz.projektjavaandroid;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class DziennikActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private EditText cwiczenieET;
    private EditText dataET;
    private EditText obciazenieET;
    private EditText serieET;
    private Button btn;
    private ListView listView;

    private ArrayList <DataModel> dataModels;
    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_dziennik);

        cwiczenieET = findViewById(R.id.cwiczenie_edit_text);
        dataET = findViewById(R.id.data_edit_text);
        obciazenieET = findViewById(R.id.obciazenie_edit_text);
        serieET = findViewById(R.id.serie_edit_text);
        btn = findViewById(R.id.dodaj_button);
        listView = findViewById(R.id.items_list);

        loadData();
        adapter = new CustomAdapter(dataModels, getApplicationContext());

        listView.setAdapter(adapter);

        btn.setOnClickListener(this);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dodaj_button:
                String cwiczenieWprowadzone = cwiczenieET.getText().toString();
                String dataWprowadzone = dataET.getText().toString();
                String obciazenieWprowadzone = obciazenieET.getText().toString();
                String serieWprowadzone = serieET.getText().toString();

                dataModels.add(0, new DataModel(cwiczenieWprowadzone, dataWprowadzone,"Obciazenie: " + obciazenieWprowadzone + "kg", "Liczba serii: " + serieWprowadzone));

                cwiczenieET.setText("");
                dataET.setText("");
                obciazenieET.setText("");
                serieET.setText("");

                Toast.makeText(this, "Dodano do dziennika", Toast.LENGTH_SHORT).show();

                adapter.notifyDataSetChanged();
                saveData();
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        dataModels.remove(position);
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Usunieto", Toast.LENGTH_SHORT).show();
    }

    private void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(dataModels);
        editor.putString("Cwiczenia", json);
        editor.apply();
    }

    private void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("Cwiczenia", null);
        Type type = new TypeToken<ArrayList<DataModel>>(){}.getType();
        dataModels = gson.fromJson(json, type);

        if (dataModels == null) {
            dataModels = new ArrayList<>();
        }
    }
}
