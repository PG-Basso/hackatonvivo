package com.example.thiago.muitogelo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.Toast;

public class CadastroImovel3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_imovel3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void voltar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void insertSiteP(View view) {
        int floorNumber = Integer.parseInt(((AutoCompleteTextView)findViewById(R.id.floorNumber)).getText().toString());
        String closestAvenue = ((AutoCompleteTextView)findViewById(R.id.closestAvenue)).getText().toString();
        boolean isAccessAvailable = ((RadioButton)findViewById(R.id.yesToAccess)).isChecked();
        String howAccessProvided = ((AutoCompleteTextView)findViewById(R.id.howAccessProvided)).getText().toString();
        boolean isPowerAvailable = ((RadioButton)findViewById(R.id.yesToEnergy)).isChecked();
        String availablePower = ((AutoCompleteTextView)findViewById(R.id.availablePower)).getText().toString();
        String nearestPowerSupply = ((AutoCompleteTextView)findViewById(R.id.nearestPowerSupply)).getText().toString();
        String powerSupplier = ((AutoCompleteTextView)findViewById(R.id.powerSupplier)).getText().toString();
        boolean isObstructed = findViewById(R.id.yesToObstructed).isSelected();
        double totalArea = Double.parseDouble(((AutoCompleteTextView)findViewById(R.id.totalArea)).getText().toString());
        String existingConstruction = ((AutoCompleteTextView)findViewById(R.id.existingConstruction)).getText().toString();
        boolean elevatorAccess = ((RadioButton)findViewById(R.id.yesToElevator)).isChecked();
        boolean ladderAccess = ((RadioButton)findViewById(R.id.yesToLadder)).isChecked();
        boolean craneAccess = ((RadioButton)findViewById(R.id.yesToCrane)).isChecked();
        boolean openAccess = ((RadioButton)findViewById(R.id.yesToOpen)).isChecked();
        String comments = ((AutoCompleteTextView)findViewById(R.id.comments)).getText().toString();
		
		try {
            VivoDbDAO dao = new VivoDbDAO(this);
            dao.insertSiteP(
                    floorNumber,
                    closestAvenue,
                    isAccessAvailable,
                    howAccessProvided,
                    isPowerAvailable,
                    availablePower,
                    nearestPowerSupply,
                    powerSupplier,
                    isObstructed,
                    totalArea,
                    existingConstruction,
                    elevatorAccess,
                    ladderAccess,
                    craneAccess,
                    openAccess,
                    comments
                    );
            Toast.makeText(this, "Usuário inserido", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, PremiosActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }
}