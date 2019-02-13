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

public class BarkiActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.wyciskaniesztangisprzedglowy, R.drawable.wyciskaniesztangizzaglowy, R.drawable.wyciskaniesztangielek, R.drawable.arnoldkiinnaodmianacwiczenia, R.drawable.unoszeniesztangielekbokiemwgore, R.drawable.unoszeniesztangielekwopadzietulowia, R.drawable.podnoszeniesztangiwzdluztulowia, R.drawable.unoszenieramionwprzodzesztanga, R.drawable.unoszenieramionwprzodzesztangielkami, R.drawable.unoszenieramionzesztangielkamiwlezeniu, R.drawable.unoszenieramionwprzodzlinkamiwyciagu, R.drawable.unoszenieramionbokiemwgorezlinkamiwyciagu, R.drawable.unoszenieramionbokiemwopadzietulowiazlinkamiwyciagu, R.drawable.odwrotnerozpietkinamaszynie};
    String[] NAMES = {"Wyciskanie sztangi sprzed głowy", "Wyciskanie sztangi zza głowy", "Wyciskanie sztangielek", "Arnoldki-inna odmiana ćwiczenia", "Unoszenie sztangielek bokiem w górę", "Unoszenie sztangielek w opadzie tułowia", "Podciąganie sztangi wzdłuż tułowia", "Unoszenie ramion w przód ze sztangą", "Unoszenie ramion w przód ze sztangielkami", "Unoszenie ramion ze sztangielkami w leżeniu", "Unoszenie ramion w przód z linkami wyciągu", "Unoszenie ramion bokiem w górę z linkami wyciągu", "Unoszenie ramion bokiem w górę w opadzie tułowia z linkami wyciągu", "Odwrotne rozpiętki (na maszynie)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_barki);

        final ListView barkiListView = (ListView)findViewById(R.id.barkiListView);

        final BarkiActivity.CustomAdapter customAdapter = new BarkiActivity.CustomAdapter();
        barkiListView.setAdapter(customAdapter);

        barkiListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/BclIGnkgZVc")));
                }
                if (position == 1) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/0uG8lIiAPpY")));
                }
                if (position == 2) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/XhCtAly3Kj0")));
                }
                if (position == 3) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Q1tpgtNxgeQ")));
                }
                if (position == 4) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/5qDTijyAJ_U")));
                }
                if (position == 5) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/NBLs0ksPczQ")));
                }
                if (position == 6) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/UJN3gVIvNk4")));
                }
                if (position == 7) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-ftuEtCpZEc")));
                }
                if (position == 8) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/dfm6qnoZRGQ")));
                }
                if (position == 9) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/kfplmjHLRGc")));
                }
                if (position == 10) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-ftuEtCpZEc")));
                }
                if (position == 11) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/1vAJnEasiTg")));
                }
                if (position == 12) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/nhBfH4cwgGM")));
                }
                if (position == 13) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/5TOV-C-3jEs")));
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
