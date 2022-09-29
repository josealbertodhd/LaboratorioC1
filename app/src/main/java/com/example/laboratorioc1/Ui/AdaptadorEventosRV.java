package com.example.laboratorioc1.Ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratorioc1.Modelos.Eventos;
import com.example.laboratorioc1.R;

import java.util.LinkedList;

public class AdaptadorEventosRV extends RecyclerView.Adapter<AdaptadorEventosRV.AdaptadorEventosViewHolder> {
    LinkedList<Eventos> eventos;

    public AdaptadorEventosRV(LinkedList<Eventos> eventos) {
        this.eventos = eventos;
    }

    @NonNull
    @Override
    public AdaptadorEventosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_eventos, parent, false);
        AdaptadorEventosViewHolder adaptadorEventosViewHolder = new AdaptadorEventosViewHolder(view);
        return adaptadorEventosViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorEventosViewHolder holder, int position) {
        Eventos evento = eventos.get(position);
        holder.tv_fecha_inicio.setText(evento.getFecha_HoraI_Eventos() +"");
        holder.tv_causa.setText(evento.getCausa() + "");
        holder.tv_server.setText(evento.getServer()+"");
        holder.tv_solucion.setText(evento.getSolucion());
        holder.tv_fecha_fin.setText(evento.getFecha_HoraF_Eventos());
        holder.tv_indisponibilidad.setText(evento.getIndisponibilidad());
    }

    @Override
    public int getItemCount() {
        return eventos.size();
    }

    public class AdaptadorEventosViewHolder extends RecyclerView.ViewHolder {
        TextView tv_fecha_inicio, tv_causa, tv_server, tv_solucion,tv_fecha_fin, tv_indisponibilidad;
        public AdaptadorEventosViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_fecha_inicio = itemView.findViewById(R.id.tv_fecha_inicio);
            tv_causa = itemView.findViewById(R.id.tv_causa);
            tv_server = itemView.findViewById(R.id.tv_server);
            tv_solucion = itemView.findViewById(R.id.tv_solucion);
            tv_fecha_fin = itemView.findViewById(R.id.tv_fecha_fin);
            tv_indisponibilidad = itemView.findViewById(R.id.tv_indisponibilidad);
        }
    }
}
