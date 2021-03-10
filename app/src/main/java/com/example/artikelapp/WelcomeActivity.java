package com.example.artikelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_main);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    public void openArtikel(View view) {
        Intent a = new Intent(WelcomeActivity.this, ArtikelActivity.class);
        a.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        overridePendingTransition(0, 0);
    }
    public void openBiodata(View view) {
        Intent a = new Intent(WelcomeActivity.this, BiodataActivity.class);
        a.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        overridePendingTransition(0, 0);
    }
}