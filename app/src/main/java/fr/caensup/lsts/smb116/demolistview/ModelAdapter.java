package fr.caensup.lsts.smb116.demolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ModelAdapter extends BaseAdapter {

    private Model model;
    private AppCompatActivity activity;

    public ModelAdapter(AppCompatActivity activity ) {
        this.activity = activity;
    }

    public void setModel( Model model ) {
        this.model = model;
    }
    @Override
    public int getCount() {
        return model.getCount();
    }

    @Override
    public Object getItem(int i) {
        int row = (i) / model.getColCount();
        int col = (i) % model.getColCount();
        // Pas obligatoire java fait de l'AUTOBOXING
        // il transforme automatiquement les int en Integer
        return new Integer( model.getNumber( row , col ) );
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if ( view == null ) {
            LayoutInflater inflater = null;
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listmat_item, viewGroup, false);
            TextView tvNumber = (TextView) view.findViewById(R.id.tvNumber);
            view.setTag( tvNumber );
        }

        int row = (i) / model.getColCount();
        int col = (i) % model.getColCount();
        ((TextView)view.getTag()).setText( ""+model.getNumber( row , col ));
        return view;
    }
}
