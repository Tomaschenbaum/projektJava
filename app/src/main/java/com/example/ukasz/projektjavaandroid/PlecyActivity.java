package com.example.ukasz.projektjavaandroid;

import android.content.Intent;
import android.media.Image;
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

public class PlecyActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.podciaganienadrazkuszerokimuchwytemnachwyt, R.drawable.podciaganienadrazkupodchwytem, R.drawable.podciaganiesztangiwopadziewioslowanie, R.drawable.podciaganiesztangielkiwopadziewioslowanie, R.drawable.podciaganiekoncasztangiwopadzie, R.drawable.przeciaganielinkiwyciagudolnegowsiadzieplaskim, R.drawable.przeciaganielinkiwyciagugornegowsiadzie, R.drawable.sciaganiedrazkawyciagugornegowsiadzieszerokimuchwytem, R.drawable.sciaganiedrazkawyciagugornegowsiadziepodchwytem, R.drawable.sciaganiedrazkawyciagugornegowsiadzieuchwytneutralny, R.drawable.podciaganiewioslowaniewlezeniunalaweczcepoziomej,  R.drawable.sklonyzesztangatrzymananakarkudziendobry, R.drawable.unoszenietulowiazopadu, R.drawable.martwyciag, R.drawable.martwyciagnaprostychnogach, R.drawable.wzniosybarkowszrugsy};
    String[] NAMES = {"PODCIĄGANIE NA DRĄŻKU SZEROKIM UCHWYTEM (NACHWYT)", "PODCIĄGANIE NA DRĄŻKU PODCHWYTEM", "PODCIĄGANIE SZTANGI W OPADZIE (WIOSŁOWANIE)", "PODCIĄGANIE SZTANGIELKI W OPADZIE (WIOSŁOWANIE)", "PODCIĄGANIE KOŃCA SZTANGI W OPADZIE", "PRZYCIĄGANIE LINKI WYCIĄGU DOLNEGO W SIADZIE PŁASKIM", "PRZYCIĄGANIE LINKI WYCIĄGU GÓRNEGO W SIADZIE", "ŚCIĄGANIE DRĄŻKA WYCIĄGU GÓRNEGO W SIADZIE SZEROKIM UCHWYTEM (NACHWYT)", "ŚCIĄGANIE DRĄŻKA WYCIĄGU GÓRNEGO W SIADZIE PODCHWYTEM", "ŚCIĄGANIE DRĄŻKA WYCIĄGU GÓRNEGO W SIADZIE UCHWYT NEUTRALNY", "PODCIĄGANIE (WIOSŁOWANIE) W LEŻENIU NA ŁAWECZCE POZIOMEJ", "SKŁONY ZE SZTANGĄ TRZYMANĄ NA KARKU (TZW. 'DZIEŃ DOBRY')", "UNOSZENIE TUŁOWIA Z OPADU", "MARTWY CIĄG", "MARTWY CIAG NA PROSTYCH NOGACH", "WZNOSY BARKÓW 'SZRUGSY'"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_plecy);

        final ListView plecyListView = (ListView)findViewById(R.id.plecyListView);

        final CustomAdapter customAdapter = new CustomAdapter();
        plecyListView.setAdapter(customAdapter);

        plecyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/X5eptRVZUno")));
                }
                if (position == 1) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/HkZH3rgnTUo")));
                }
                if (position == 2) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/PaqvesLOcpA")));
                }
                if (position == 3) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/zTEXQ4WH7oY")));
                }
                if (position == 4) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-XD4HXqqdNY")));
                }
                if (position == 5) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/XOoFudeINrw")));
                }
                if (position == 6) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/A6_aGkGx5Z8")));
                }
                if (position == 7) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-2am6tU5HCs")));
                }
                if (position == 8) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/JIyVH8TNWHY")));
                }
                if (position == 9) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/A6_aGkGx5Z8")));
                }
                if (position == 10) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/gc1qpnI2EyM")));
                }
                if (position == 11) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/GNWS8d4y9uU")));
                }
                if (position == 12) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/AekTgKMAwnU")));
                }
                if (position == 13) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Vzn3hCHUkD0")));
                }
                if (position == 14) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/c5KjZ_43owM")));
                }
                if (position == 15) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/8SMJ56w_sPM")));
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
