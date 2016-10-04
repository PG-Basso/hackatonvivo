package com.example.thiago.muitogelo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroImovel1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_imovel1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void insertSite(View view) {
        String type = ((AutoCompleteTextView)findViewById(R.id.type)).getText().toString();
        String address = ((AutoCompleteTextView)findViewById(R.id.address)).getText().toString();
        String city = ((AutoCompleteTextView)findViewById(R.id.city)).getText().toString();
        String district = ((AutoCompleteTextView)findViewById(R.id.district)).getText().toString();
        String cep = ((AutoCompleteTextView)findViewById(R.id.cep)).getText().toString();
        String state = ((AutoCompleteTextView)findViewById(R.id.state)).getText().toString();
        double latitude = Double.parseDouble(((EditText)findViewById(R.id.latitude)).getText().toString());
        double longitude = Double.parseDouble(((AutoCompleteTextView)findViewById(R.id.longitude)).getText().toString());
        double altitude = Double.parseDouble(((AutoCompleteTextView)findViewById(R.id.altitude)).getText().toString());
        try {
            VivoDbDAO dao = new VivoDbDAO(this);
            dao.insertSite(
                    type,
                    address,
                    city,
                    district,
                    state,
                    cep,
                    latitude,
                    longitude,
                    altitude);
            Toast.makeText(this, "Site 1 inserido", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, CadastroImovel2Activity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }
}