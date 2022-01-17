package simple.example.hewanpedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import simple.example.hewanpedia.model.Pedia;

public class DaftarPediaAdapter extends ArrayAdapter<Pedia> {

    Context context;

    public DaftarPediaAdapter(Context context, List<Pedia> pedias) {
        super(context, R.layout.row_daftar_pedia, pedias);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textAsal;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Pedia pedia = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_pedia, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textAsal = (TextView) convertView.findViewById(R.id.row_text_asal);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_pedia);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(pedia.getRas());
        viewHolder.textAsal.setText(pedia.getAsal());
        viewHolder.gambar.setImageDrawable(context.getDrawable(pedia.getDrawableRes()));
        return convertView;
    }

}
