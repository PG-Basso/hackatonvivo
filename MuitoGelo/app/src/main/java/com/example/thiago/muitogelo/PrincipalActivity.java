package com.example.thiago.muitogelo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void irCadastroImovel(View v) {
        Intent i = new Intent(this, CadastroImovel1Activity.class);
        startActivity(i);
    }
}
