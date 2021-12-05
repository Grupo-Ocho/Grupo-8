package co.edu.unab.formsaludapp.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.unab.formsaludapp.Adapters.AdapterListaMasa;
import co.edu.unab.formsaludapp.Adapters.AdapterListaMetabolismo;
import co.edu.unab.formsaludapp.R;
import co.edu.unab.formsaludapp.modelo.MasaCorporal;
import co.edu.unab.formsaludapp.modelo.Metabolismo;

public class ListadoMetabolismo extends AppCompatActivity {

    private ArrayList<Metabolismo> listaMetabolismo = new ArrayList<>();
    private ListView lista;
    private AdapterListaMetabolismo adapterListaMetabolismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_metabolismo);
        cargarExtras();
        llenarLista();
    }

    private void cargarExtras() {
        listaMetabolismo = (ArrayList<Metabolismo>) getIntent().getSerializableExtra("listadoMetabolismo");
    }

    private void llenarLista() {
        lista = findViewById(R.id.lstMetabolismo);
        adapterListaMetabolismo = new AdapterListaMetabolismo(listaMetabolismo, this);
        lista.setAdapter(adapterListaMetabolismo);
    }

}
