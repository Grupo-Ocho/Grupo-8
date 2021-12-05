package co.edu.unab.formsaludapp.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.edu.unab.formsaludapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CALCULAR MASA
        Button botonCalcularMasa = (Button) findViewById(R.id.buttonMasa);
        botonCalcularMasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalcularMasa.class);
                startActivity(intent);
            }
        });

        //CALCULAR METABOLISMO
        Button botonCalcularMetabolismo = (Button) findViewById(R.id.buttonMetabolismo);
        botonCalcularMetabolismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalcularMetabolismo.class);
                startActivity(intent);
            }
        });

    }
}