package com.example.thiago.muitogelo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void cadastrar(View view) {
        String fullName = ((AutoCompleteTextView)findViewById(R.id.nomeCadastro)).getText().toString();
        String dateOfBirth = ((TextView)findViewById(R.id.dataNasc)).getText().toString();
        String email = ((AutoCompleteTextView)findViewById(R.id.emailCadastro)).getText().toString();
        String phoneNumber = ((AutoCompleteTextView)findViewById(R.id.telefone)).getText().toString();
        boolean isVivo = ((RadioButton)findViewById(R.id.radioSim)).isChecked();
        String city = ((AutoCompleteTextView)findViewById(R.id.cidade)).getText().toString();
        String state = ((AutoCompleteTextView)findViewById(R.id.estado)).getText().toString();
        String street = ((AutoCompleteTextView)findViewById(R.id.rua)).getText().toString();
        String district = ((AutoCompleteTextView)findViewById(R.id.bairro)).getText().toString();

        try {
            VivoDbDAO dao = new VivoDbDAO(this);
            dao.insertUser(fullName, dateOfBirth, email, phoneNumber, isVivo, city, state, street, district);
            Toast.makeText(this, "Usuário inserido", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, PrincipalActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }
}