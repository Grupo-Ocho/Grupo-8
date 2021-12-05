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

public class AdapterListaMasa extends BaseAdapter {

    private ArrayList<MasaCorporal> listaMasa;
    private final Context context;

    public AdapterListaMasa(ArrayList<MasaCorporal> listaMasa, Context context) {
        this.listaMasa = listaMasa;
        this.context = context;
    }


    @Override
    public int getCount() {
        return listaMasa.size();
    }

    @Override
    public Object getItem(int position) {
        return listaMasa.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        try {
            if (convertView==null)
                convertView = ((LayoutInflater) Objects.requireNonNull(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))).inflate(R.layout.item_list_masa_corporal, null);

            final MasaCorporal masaCorporal = listaMasa.get(position);

            ((TextView) convertView.findViewById(R.id.txtPesoLista)).setText(masaCorporal.getPesoUsuario());
            ((TextView) convertView.findViewById(R.id.txtAlturaLista)).setText(masaCorporal.getEstaturaUsuario());
            ((TextView) convertView.findViewById(R.id.txtMasaLista)).setText(masaCorporal.getMasaCorporalUsuario());
        }catch (Exception e){
            Log.e("Error listado", e.getMessage(), e);
        }
        return convertView;
    }
}
