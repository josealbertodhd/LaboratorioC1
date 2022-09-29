package com.example.laboratorioc1.Ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratorioc1.Modelos.Seguridad;
import com.example.laboratorioc1.R;

import java.util.LinkedList;

public class AdaptadorSeguridadRV extends RecyclerView.Adapter<AdaptadorSeguridadRV.AdaptadorSeguridadViewHolder> {

    LinkedList<Seguridad> l_seguridad;
    Activity context;

    public AdaptadorSeguridadRV(LinkedList<Seguridad> l_seguridad, Activity context) {
        this.l_seguridad = l_seguridad;
        this.context = context;
    }

    @NonNull
    @Override
    public AdaptadorSeguridadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_menu_seguridad, parent, false);
        AdaptadorSeguridadViewHolder adaptadorSeguridadViewHolder = new AdaptadorSeguridadViewHolder(view);
        return adaptadorSeguridadViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorSeguridadViewHolder holder, int position) {
        Seguridad seguridad = l_seguridad.get(position);
        holder.tv_servidor_menus.setText(seguridad.getNombre_servidor() + "");
        holder.tv_evento_menus.setText(seguridad.getNombre_evento()+"");
        holder.tv_descripcion_menus.setText(seguridad.getDescripcion()+"");
    }

    @Override
    public int getItemCount() {
        return l_seguridad.size();
    }

    public class AdaptadorSeguridadViewHolder extends RecyclerView.ViewHolder {
        TextView tv_servidor_menus, tv_evento_menus, tv_descripcion_menus;
        public AdaptadorSeguridadViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_servidor_menus = itemView.findViewById(R.id.tv_servidor_menus);
            tv_evento_menus = itemView.findViewById(R.id.tv_evento_menus);
            tv_descripcion_menus = itemView.findViewById(R.id.tv_descripcion_menus);
        }
    }
}
