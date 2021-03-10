package com.example.artikelapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata_main);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    public void wame(View view) {
        Uri uri = Uri.parse("https://wa.me/qr/IV6GKB5QSVS3D1"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openArtikel(View view) {
        Intent a = new Intent(BiodataActivity.this, ArtikelActivity.class);
        startActivity(a);
        overridePendingTransition(0, 0);
    }

    public void openHome(View view) {
        Intent a = new Intent(BiodataActivity.this, WelcomeActivity.class);
        startActivity(a);
        overridePendingTransition(0, 0);
    }
}