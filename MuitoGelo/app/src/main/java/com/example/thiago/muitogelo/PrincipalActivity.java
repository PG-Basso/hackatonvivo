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
        IdManager idm = new IdManager(this);
        Intent i;
        if (idm.getSiteId() > idm.getSiteLId()) {
            i = new Intent(this, CadastroImovel2Activity.class);
        } else if (idm.getSiteLId() > idm.getSitePId()) {
            i = new Intent(this, CadastroImovel3Activity.class);
        } else {
            i = new Intent(this, CadastroImovel1Activity.class);
        }
        startActivity(i);
    }

    public void irPremios(View v) {
        Intent i = new Intent(this, PremiosActivity.class);
        startActivity(i);
    }

    public void abreSaibaMais(View view) {
        Intent intent = new Intent(this, SaibaMaisActivity.class);
        startActivity(intent);
    }
    public void abreFAQ(View view) {
        Intent intent = new Intent(this, FAQActivity.class);
        startActivity(intent);
    }
}
