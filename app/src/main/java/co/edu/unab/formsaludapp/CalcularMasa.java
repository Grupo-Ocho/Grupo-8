package co.edu.unab.formsaludapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CalcularMasa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_masa);
        setBoton();
    }

    private void setBoton() {
        Button btnCalcularMasa = findViewById(R.id.buttonCalcularMasa);
        btnCalcularMasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Estatura = ((EditText) findViewById(R.id.editTextEstatura)).getText().toString();
                String Peso = ((EditText) findViewById(R.id.editTextPeso)).getText().toString();
                LinearLayout linearLayoutResultados = findViewById(R.id.llayoutResultados);
                linearLayoutResultados.setVisibility(View.VISIBLE);
                double masaCorporal = Math.pow(Double.parseDouble(Peso)/Double.parseDouble(Estatura), 2);
                ((TextView)findViewById(R.id.txtMasaCorporalResultado)).setText("IMC: "+ masaCorporal);
                ((TextView)findViewById(R.id.txtPesoResultado)).setText("Peso: "+ Peso);
                ((TextView)findViewById(R.id.txtEstaturaResultado)).setText("Estatura: "+ Estatura);


            }
        });
    }
}