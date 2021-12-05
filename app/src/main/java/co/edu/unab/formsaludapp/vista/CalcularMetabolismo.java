package co.edu.unab.formsaludapp.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

import co.edu.unab.formsaludapp.R;
import co.edu.unab.formsaludapp.modelo.Metabolismo;

public class CalcularMetabolismo extends AppCompatActivity {


    private ArrayList<Metabolismo> listaMetabolismo = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_metabolismo);
        setListeners();
    }

    private void setListeners() {
        RadioGroup opcionSexo = findViewById(R.id.opciones_sexo);

        Button buttonCalcular = findViewById(R.id.buttonCalcularMetabolismo);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int radioButtonId = opcionSexo.getCheckedRadioButtonId();
                View radioButton = opcionSexo.findViewById(radioButtonId);
                int idX = opcionSexo.indexOfChild(radioButton);

                Double metabolismo = 0.0;
                Double peso = Double.parseDouble(((EditText) findViewById(R.id.editTextPesoMeta)).getText().toString());
                Double altura = Double.parseDouble(((EditText) findViewById(R.id.editTextTextEstaturaMeta)).getText().toString());
                Double edad = Double.parseDouble(((EditText) findViewById(R.id.editTextEdad)).getText().toString());

                LinearLayout linearLayoutResultados = findViewById(R.id.llayoutResultadosMetabolismo);
                linearLayoutResultados.setVisibility(View.VISIBLE);

                double formula = (10 * peso) + (6.25 * altura) - (5 * edad);

                String sexo;
                if (idX==0){

                    metabolismo = formula +5;
                    sexo = "Hombre";

                } else{

                    metabolismo = formula - 161;

                    sexo = "Mujer";
                }

                ((TextView) findViewById(R.id.txtEstaturaResultado)).setText("Altura: "+altura);
                ((TextView) findViewById(R.id.txtPesoResultado)).setText("Peso: "+peso);
                ((TextView) findViewById(R.id.txtEdadResultado)).setText("Edad: "+edad);
                ((TextView) findViewById(R.id.txtMetabolismoResultado)).setText("Metabolismo: "+metabolismo);

                Metabolismo metabolismoUsuario = new Metabolismo(altura.toString(), peso.toString(), edad.toString(), sexo, metabolismo.toString());
                listaMetabolismo.add(metabolismoUsuario);

            }
        });


        Button btnListado = findViewById(R.id.buttonListadoMetabolismo);
        btnListado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLista = new Intent(CalcularMetabolismo.this, ListadoMetabolismo.class);
                intentLista.putExtra("listadoMetabolismo",listaMetabolismo);
                startActivity(intentLista);
            }
        });
    }
}