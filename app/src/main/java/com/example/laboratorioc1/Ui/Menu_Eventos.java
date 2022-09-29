package com.example.laboratorioc1.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.laboratorioc1.Modelos.Eventos;
import com.example.laboratorioc1.R;
import com.example.laboratorioc1.Ui.AdaptadorEventosRV;

import java.util.LinkedList;

public class Menu_Eventos extends AppCompatActivity {
    private LinkedList<Eventos> eventos = new LinkedList<>();
    private RecyclerView rv_menu_eventos;
    private AdaptadorEventosRV adaptadorEventosRV;
    private LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eventos);
        rv_menu_eventos = findViewById(R.id.rv_menu_eventos);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        rv_menu_eventos.setLayoutManager(linearLayoutManager);

        eventos.add(new Eventos("Fecha Inicio", "Fecha Fin",
                "Causa", "Server", "Indisponibilidad", "Solucion"));

        eventos.add(new Eventos("05:32:12 08/12/2021", "05:32:12 08/12/2021",
                "Cambio de Base de Datos", "Nginx", "Si", "Restablecer la Base de Datos"));

        eventos.add(new Eventos("05:32:12 08/12/2021", "05:32:12 08/12/2021",
                "Cambio de Base de Datos", "Nginx", "Si", "Restablecer la Base de Datos"));

        eventos.add(new Eventos("05:32:12 08/12/2021", "05:32:12 08/12/2021",
                "Cambio de Base de Datos", "Nginx", "Si", "Restablecer la Base de Datos"));

        eventos.add(new Eventos("05:32:12 08/12/2021", "05:32:12 08/12/2021",
                "Cambio de Base de Datos", "Nginx", "Si", "Restablecer la Base de Datos"));

        adaptadorEventosRV = new AdaptadorEventosRV(eventos);
        rv_menu_eventos.setAdapter(adaptadorEventosRV);

    }
}