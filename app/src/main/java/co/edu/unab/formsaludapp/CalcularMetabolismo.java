package co.edu.unab.formsaludapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CalcularMetabolismo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_metabolismo);
        setListeners();
    }

    private void setListeners() {
        RadioGroup opcionSexo = findViewById(R.id.opciones_sexo);
        int radioButtonId = opcionSexo.getCheckedRadioButtonId();
        View radioButton = opcionSexo.findViewById(radioButtonId);
        int idX = opcionSexo.indexOfChild(radioButton);

        Button buttonCalcular = findViewById(R.id.buttonCalcularMetabolismo);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double metabolismo = 0.0;
                Double peso = Double.parseDouble(((EditText) findViewById(R.id.editTextPesoMeta)).getText().toString());
                Double altura = Double.parseDouble(((EditText) findViewById(R.id.editTextTextEstaturaMeta)).getText().toString());
                Double edad = Double.parseDouble(((EditText) findViewById(R.id.editTextEdad)).getText().toString());

                LinearLayout linearLayoutResultados = findViewById(R.id.llayoutResultadosMetabolismo);
                linearLayoutResultados.setVisibility(View.VISIBLE);

                double formula = (10 * peso) + (6.25 * altura) - (5 * edad);

                if (idX==0){

                    metabolismo = formula +5;

                } else{

                    metabolismo = formula - 161;

                }

                ((TextView) findViewById(R.id.txtEstaturaResultado)).setText("Altura: "+altura);
                ((TextView) findViewById(R.id.txtPesoResultado)).setText("Peso: "+peso);
                ((TextView) findViewById(R.id.txtEdadResultado)).setText("Edad: "+edad);
                ((TextView) findViewById(R.id.txtMetabolismoResultado)).setText("Metabolismo: "+metabolismo);


            }
        });
    }
}