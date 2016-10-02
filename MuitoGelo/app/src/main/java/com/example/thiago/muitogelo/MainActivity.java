package com.example.thiago.muitogelo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void abreSaibaMais(View view) {
        Intent intent = new Intent(this, SaibaMaisActivity.class);
        startActivity(intent);
    }
    public void abreFAQ(View view) {
        Intent intent = new Intent(this, FAQActivity.class);
        startActivity(intent);
    }
    public void abreCadastro(View view) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
}