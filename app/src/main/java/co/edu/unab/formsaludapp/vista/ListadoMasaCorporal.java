package co.edu.unab.formsaludapp.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.unab.formsaludapp.Adapters.AdapterListaMasa;
import co.edu.unab.formsaludapp.R;
import co.edu.unab.formsaludapp.modelo.MasaCorporal;

public class ListadoMasaCorporal extends AppCompatActivity {

    private ArrayList<MasaCorporal> listaMasaCorporal = new ArrayList<>();
    private ListView lista;
    private AdapterListaMasa adapterListaMasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_masa_corporal);
        cargarExtras();
        llenarLista();
    }

    private void cargarExtras() {
        listaMasaCorporal = (ArrayList<MasaCorporal>) getIntent().getSerializableExtra("listadoMasa");
    }

    private void llenarLista() {
        lista = findViewById(R.id.lstMasaCorporal);
        adapterListaMasa = new AdapterListaMasa(listaMasaCorporal, this);
        lista.setAdapter(adapterListaMasa);
    }
}