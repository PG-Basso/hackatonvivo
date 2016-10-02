package com.example.thiago.muitogelo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.Toast;

public class CadastroImovel2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_imovel2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void voltar(View view) {
        finish();
    }
    public void insertSiteL(View view) {
        String name = ((AutoCompleteTextView)findViewById(R.id.name)).getText().toString();
        String ownerName = ((AutoCompleteTextView)findViewById(R.id.ownerName)).getText().toString();
        String ownerPhoneNumber = ((AutoCompleteTextView)findViewById(R.id.ownerPhoneNumber)).getText().toString();
        String ownerAddress = ((AutoCompleteTextView)findViewById(R.id.ownerAddress)).getText().toString();
        String repName = ((AutoCompleteTextView)findViewById(R.id.repName)).getText().toString();
        String repPhoneNumber = ((AutoCompleteTextView)findViewById(R.id.repPhoneNumber)).getText().toString();
        String repAddress = ((AutoCompleteTextView)findViewById(R.id.repAddress)).getText().toString();
        String syndName = ((AutoCompleteTextView)findViewById(R.id.syndName)).getText().toString();
        String syndPhoneNumber = ((AutoCompleteTextView)findViewById(R.id.syndPhoneNumber)).getText().toString();
        boolean isDeedAvailable = ((RadioButton)findViewById(R.id.escrituraSim)).isChecked();
        boolean isDocAvailable = ((RadioButton)findViewById(R.id.xptoSim)).isChecked();

        try {
            VivoDbDAO dao = new VivoDbDAO(this);
            dao.insertSiteL(
                    name,
                    ownerName,
                    ownerPhoneNumber,
                    ownerAddress,
                    repName,
                    repPhoneNumber,
                    repAddress,
                    syndName,
                    syndPhoneNumber,
                    isDeedAvailable,
                    isDocAvailable);
            Toast.makeText(this, "Site 2 inserido", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, CadastroImovel3Activity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }
}