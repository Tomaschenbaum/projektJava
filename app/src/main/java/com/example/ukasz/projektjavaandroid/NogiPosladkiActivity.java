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

public class NogiPosladkiActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11, R.drawable.image12, R.drawable.image13, R.drawable.image14, R.drawable.image15, R.drawable.image16, R.drawable.image17, R.drawable.image18,};
    String[] NAMES = {"PRZYSIADY ZE SZTANGĄ NA BARKACH", "PRZYSIADY ZE SZTANGĄ TRZYMANĄ Z PRZODU", "HACK-PRZYSIADY", "PRZYSIADY NA SUWNICY SKOŚNEJ (HACK-MASZYNIE)", "SYZYFKI", "PROSTOWNIE NÓG W SIADZIE", "WYPYCHANIE CIĘŻARU NA SUWNICY (MASZYNIE)", "UGINANIE NÓG W LEŻENIU", "PRZYSIADY WYKROCZNE", "NOŻYCE", "WYSOKI STEP ZA SZTANGĄ/SZTANGIELKAMI", "ODWODZENIE NOGI W TYŁ", "PRZYWODZENIE NÓG DO WEWNĄTRZ", "ODWODZENIE NÓG NA ZEWNĄTRZ", "”MARTWY CIĄG”NA PROSTYCH NOGACH", "WSPIECIA NA PALCE W STANIU", "OŚLE WSPIĘCIA", "WYPYCHANIE CIĘŻARU NA MASZYNIE/SUWNICY PALCAMI NÓG"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_nogi_posladki);

        final ListView nogiPosladkiListView = (ListView)findViewById(R.id.nogiPosladkiListView);

        final NogiPosladkiActivity.CustomAdapter customAdapter = new NogiPosladkiActivity.CustomAdapter();
        nogiPosladkiListView.setAdapter(customAdapter);

        nogiPosladkiListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/nnk9KItK938")));
                }
                if (position == 1) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/rdCcNWe7j1s")));
                }
                if (position == 2) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/8U2_8ye8lmQ")));
                }
                if (position == 3) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/RJ4u3rJxE8g")));
                }
                if (position == 4) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/D-aftlXh7tE")));
                }
                if (position == 5) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/zmpFEl7NFG0")));
                }
                if (position == 6) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/HIAWxO-NPpA")));
                }
                if (position == 7) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/KC4clTFYqEk")));
                }
                if (position == 8) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/fqymGym7YL0")));
                }
                if (position == 9) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/OcmOSTb1nNg")));
                }
                if (position == 10) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/A0ZCa8j_Ax0")));
                }
                if (position == 11) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/6DQFHs5JoZw")));
                }
                if (position == 12) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/SG5FR0v6St4")));
                }
                if (position == 13) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/bR8PmizrcOc")));
                }
                if (position == 14) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/c5KjZ_43owM")));
                }
                if (position == 15) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/mbyTbDJBsR8")));
                }
                if (position == 16) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/wsyBvIV3okM")));
                }
                if (position == 17) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Ms0zzmzw6TE")));
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
