package co.edu.unab.formsaludapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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