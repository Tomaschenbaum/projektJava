package com.example.ukasz.projektjavaandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class BrzuchActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.sklonywlezeniuplasko, R.drawable.sklonytulowiazlinkawyciagusiedzac, R.drawable.skretytulowia, R.drawable.sklonytulowiazlinkawyciagukleczac, R.drawable.sklonyboczne, R.drawable.skretytulowiawlezeniu};
    String[] NAMES = {"SKŁONY W LEŻENIU PŁASKO", "SKŁONY TUŁOWIA Z LINKĄ WYCIĄGU SIEDZĄC", "SKRĘTY TUŁOWIA", "SKŁONY TUŁOWIA Z LINKĄ WYCIĄGU KLĘCZĄC", "SKŁONY BOCZNE", "SKRĘTY TUŁOWIA W LEŻENIU"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_brzuch);

        final ListView brzuchListView = (ListView)findViewById(R.id.brzuchListView);

        final BrzuchActivity.CustomAdapter customAdapter = new BrzuchActivity.CustomAdapter();
        brzuchListView.setAdapter(customAdapter);

        brzuchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/VVcm4LdmIwM")));
                }
                if (position == 1) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ufOw92cUjqg")));
                }
                if (position == 2) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/8U6qOXjaYTM")));
                }
                if (position == 3) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/AAQRVXSHlbs")));
                }
                if (position == 4) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/YzmEX_Mvfd0")));
                }
                if (position == 5) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Atl6nfJGRhg")));
                }
            }
        });
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.custom_layout, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView textView = (TextView)convertView.findViewById(R.id.textView);

            imageView.setImageResource(IMAGES[position]);
            textView.setText(NAMES[position]);

            return convertView;
        }
    }
}
