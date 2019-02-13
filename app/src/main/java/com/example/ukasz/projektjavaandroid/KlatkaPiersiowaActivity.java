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
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class KlatkaPiersiowaActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.wyciskaniesztangiwlezeniunalawcepoziomej, R.drawable.wyciskaniesztangielekwlezeniunalawcepoziomej, R.drawable.wyciskaniesztangiwlezeniunalawceskosnejglowawgore, R.drawable.wyciskaniesztangielekwlezeniunalawceskosnejglowawgore, R.drawable.rozpietkizesztangielkamiwlezeniunalawcepoziomej, R.drawable.pompkinaporeczach, R.drawable.rozpietkiwsiadzienamaszynie, R.drawable.krzyzowanielinekwyciaguwstaniu, R.drawable.wyciskaniapoziomewsiadzienamaszynie};
    String[] NAMES = {"WYCISKANIE SZTANGI W LEŻENIU NA ŁAWCE POZIOMEJ", "WYCISKANIE SZTANGIELEK W LEŻENIU NA ŁAWCE POZIOMEJ", "WYCISKANIE SZTANGI W LEŻENIU NA ŁAWCE SKOŚNEJ-GŁOWĄ  W GÓRĘ", "WYCISKANIE SZTANGIELEK W LEŻENIU NA ŁAWCE SKOŚNEJ - GŁOWĄ W GÓRĘ", "ROZPIĘTKI ZE SZTANGIELKAMI W LEŻENIU NA ŁAWCE POZIOMEJ", "POMPKI NA PORĘCZACH", "ROZPIĘTKI W SIADZIE NA MASZYNIE", "KRZYŻOWANIE LINEK WYCIĄGU W STANIU", "WYCISKANIA POZIOME W SIADZIE NA MASZYNIE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_klatka_piersiowa);

        final ListView klatkaPiersiowaListView = (ListView)findViewById(R.id.klatkaPiersiowaListView);

        final KlatkaPiersiowaActivity.CustomAdapter customAdapter = new KlatkaPiersiowaActivity.CustomAdapter();
        klatkaPiersiowaListView.setAdapter(customAdapter);

        klatkaPiersiowaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/9n4lgCrxr0I")));
                }
                if (position == 1) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/P1Qv-oXczxs")));
                }
                if (position == 2) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/voKocA7kblo")));
                }
                if (position == 3) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/0gPt--vcoW4")));
                }
                if (position == 4) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/pzb2P55g8vc")));
                }
                if (position == 5) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/WjHOdq4MAJA")));
                }
                if (position == 6) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/vSwGglMtDhs")));
                }
                if (position == 7) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/LHO_eNwI9Bc")));
                }
                if (position == 8) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/DgasTNLyQcg")));
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
