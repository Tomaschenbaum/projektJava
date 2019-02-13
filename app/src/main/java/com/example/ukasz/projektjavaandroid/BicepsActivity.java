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

public class BicepsActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.image006, R.drawable.image007, R.drawable.image008, R.drawable.image009, R.drawable.image013, R.drawable.image014, R.drawable.image015, R.drawable.image021, R.drawable.image024};
    String[] NAMES = {"UGINANIE RAMION ZE SZTANGĄ STOJAC PODCHWYTEM", "UGINANIE RAMION ZE SZTANGIELKAMI STOJĄC PODCHWYTEM (Z 'SUPINACJĄ' NADGARSTKA)", "UGINANIE RAMION ZE SZTANGIELKAMI STOJĄC (UCHWYT 'MŁOTKOWY')", "UGINANIE RAMION ZE SZTANGĄ NA 'MODLITEWNIKU'", "UGINANIE RAMION ZE SZTANGIELKAMI W SIADZIE NA ŁAWCE SKOŚNEJ (Z SUPINACJĄ NADGARSTKA)", "UGINANIE RAMIENIA ZE SZTANGIELKĄ W SIADZIE - W PODPORZE O KOLANO", "UGINANIE RAMION PODCHWYTEM STOJĄC - Z RĄCZKĄ WYCIĄGU", "UGINANIE NADGARSTKÓW PODCHWYTEM W SIADZIE", "UGINANIE NADGARSTKÓW NACHWYTEM W SIADZIE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_biceps);

        final ListView bicepsListView = (ListView)findViewById(R.id.bicepsListView);

        final BicepsActivity.CustomAdapter customAdapter = new BicepsActivity.CustomAdapter();
        bicepsListView.setAdapter(customAdapter);

        bicepsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/415ZedAmmGg")));
                }
                if (position == 1) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/1IdQyaVmCMo")));
                }
                if (position == 2) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/HTcXehjywD0")));
                }
                if (position == 3) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/BPxCVAz0gbA")));
                }
                if (position == 4) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/DtFXk_lPJig")));
                }
                if (position == 5) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/kt63lmiVck0")));
                }
                if (position == 6) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/jf2-ppnzl5Q")));
                }
                if (position == 7) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/EqYG6Nky9Nc")));
                }
                if (position == 8) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/8ZHp5hBKBIE")));
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
