package com.example.artikelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ArtikelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artikel_main);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    public void openHome(View view) {
        Intent a = new Intent(ArtikelActivity.this, WelcomeActivity.class);
        startActivity(a);
        overridePendingTransition(0, 0);
    }

    public void openBiodata(View view) {
        Intent a = new Intent(ArtikelActivity.this, BiodataActivity.class);
        startActivity(a);
        overridePendingTransition(0, 0);
    }


    public void openArtikel1(View view) {
        Uri uri = Uri.parse("https://www.dumetschool.com/blog/15-Tips-Menjadi-Freelancer-Profesional"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void openArtikel2(View view) {
        Uri uri = Uri.parse("https://shigatsu-wa-kimi-no-uso.fandom.com/f/p/3207818924523744907"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void openArtikel3(View view) {
        Uri uri = Uri.parse("https://esportsku.com/skin-harith-fashion-expert-mobile-legends-terbaru-di-lucky-shop-ml/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void openArtikel4(View view) {
        Uri uri = Uri.parse("https://ilmucoding.com/fluter-vs-react-native/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}