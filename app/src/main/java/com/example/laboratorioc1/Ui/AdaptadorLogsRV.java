package com.example.laboratorioc1.Ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratorioc1.Modelos.Logs;
import com.example.laboratorioc1.R;

import java.util.LinkedList;

public class AdaptadorLogsRV extends RecyclerView.Adapter<AdaptadorLogsRV.AdaptadorLogsViewHolder> {

    LinkedList<Logs> l_logs;

    public AdaptadorLogsRV(LinkedList<Logs> l_logs) {
        this.l_logs = l_logs;
    }

    @NonNull
    @Override
    public AdaptadorLogsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_menu_seguridad, parent, false );
        AdaptadorLogsViewHolder adaptadorLogsViewHolder = new AdaptadorLogsViewHolder(view);
        return adaptadorLogsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLogsViewHolder holder, int position) {
        Logs log = l_logs.get(position);
        holder.tv_servidor_menus.setText(log.getNombre_servidor() + "");
        holder.tv_evento_menus.setText(log.getNombre_usuario() + "");
        holder.tv_descripcion_menus.setText(log.getFecha_hora_sesion() + "\n" + log.getEstado());
    }

    @Override
    public int getItemCount() {
        return l_logs.size();
    }

    public class AdaptadorLogsViewHolder extends RecyclerView.ViewHolder {
        TextView tv_evento_menus, tv_servidor_menus, tv_descripcion_menus;
        public AdaptadorLogsViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_servidor_menus = itemView.findViewById(R.id.tv_servidor_menus);
            tv_evento_menus = itemView.findViewById(R.id.tv_evento_menus);
            tv_descripcion_menus = itemView.findViewById(R.id.tv_descripcion_menus);
        }
    }
}
