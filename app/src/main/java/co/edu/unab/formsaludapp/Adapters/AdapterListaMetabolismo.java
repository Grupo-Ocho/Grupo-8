package co.edu.unab.formsaludapp.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

import co.edu.unab.formsaludapp.R;
import co.edu.unab.formsaludapp.modelo.MasaCorporal;
import co.edu.unab.formsaludapp.modelo.Metabolismo;

public class AdapterListaMetabolismo extends BaseAdapter {
    private ArrayList<Metabolismo> listaMetabolismo;
    private final Context context;

    public AdapterListaMetabolismo(ArrayList<Metabolismo> listaMetabolismo, Context context) {
        this.listaMetabolismo = listaMetabolismo;
        this.context = context;
    }


    @Override
    public int getCount() {
        return listaMetabolismo.size();
    }

    @Override
    public Object getItem(int position) {
        return listaMetabolismo.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        try {
            if (convertView==null)
                convertView = ((LayoutInflater) Objects.requireNonNull(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))).inflate(R.layout.item_list_metabolismo, null);

            final Metabolismo metabolismo = listaMetabolismo.get(position);

            ((TextView) convertView.findViewById(R.id.txtPesoLista)).setText(metabolismo.getPesoUsuario());
            ((TextView) convertView.findViewById(R.id.txtAlturaLista)).setText(metabolismo.getEstaturaUsuario());
            ((TextView) convertView.findViewById(R.id.txtEdadLista)).setText(metabolismo.getEdadUsuario());
            ((TextView) convertView.findViewById(R.id.txtSexoLista)).setText(metabolismo.getSexoUsuario());
            ((TextView) convertView.findViewById(R.id.txtMetabolismoLista)).setText(metabolismo.getMetabolismoUsuario());
        }catch (Exception e){
            Log.e("Error listado", e.getMessage(), e);
        }
        return convertView;
    }
}
