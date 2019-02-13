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

public class TricepsActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.image028, R.drawable.image029, R.drawable.image032, R.drawable.image034, R.drawable.image036, R.drawable.image038, R.drawable.image039, R.drawable.image041, R.drawable.image042, R.drawable.image043, R.drawable.image044};
    String[] NAMES = {"PROSTOWANIE RAMION NA WYCIĄGU STOJĄC", "WYCISKANIE „FRANCUSKIE”SZTANGI W SIADZIE", "WYCISKANIE “FRANCUSKIE” JEDNORĄCZ SZTANGIELKI W SIADZIE", "WYCISKANIE „FRANCUSKIE” SZTANGI W LEŻENIU", "WYCISKANIE „FRANCUSKIE”SZTANGIELKI W LEŻENIU", "PROSTOWNIE RAMIENIA ZE SZTANGIELKĄ W OPADZIE TUŁOWIA", "PROSTOWANIE RAMION NA WYCIĄGU W PŁASZCZYŹNE POZIOMEJ STOJĄC", "POMPKI NA PORĘCZACH", "POMPKI W PODPORZE TYŁEM", "PROSTOWANIE RAMIENIA PODCHWYTEM NA WYCIĄGU STOJĄC", "WYCISKANIE W LEŻENIU NA ŁAWCE POZIOMEJ WĄSKIM UCHWYTEM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_triceps);

        final ListView tricepsListView = (ListView)findViewById(R.id.tricepsListView);

        final TricepsActivity.CustomAdapter customAdapter = new TricepsActivity.CustomAdapter();
        tricepsListView.setAdapter(customAdapter);

        tricepsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/rR8CZHw8kTw")));
                }
                if (position == 1) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/lRJz0tqLlpk")));
                }
                if (position == 2) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/rR8CZHw8kTw")));
                }
                if (position == 3) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/nYO5EcbaDos")));
                }
                if (position == 4) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Esn3Yz2Xqr8")));
                }
                if (position == 5) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/j5QxEPkEJGA")));
                }
                if (position == 6) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/T3ltIn0YH6E")));
                }
                if (position == 7) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/kh0eVi-itqA")));
                }
                if (position == 8) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/DtpGS3tJlbs")));
                }
                if (position == 9) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-tz21fvWd6A")));
                }
                if (position == 10) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/cm_68gAawDA")));
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
