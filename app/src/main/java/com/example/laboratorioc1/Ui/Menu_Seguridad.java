package com.example.laboratorioc1.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.laboratorioc1.Modelos.Seguridad;
import com.example.laboratorioc1.R;

import java.util.LinkedList;

public class Menu_Seguridad extends AppCompatActivity {
    private LinkedList<Seguridad> l_seguridad = new LinkedList<>();
    private GridLayoutManager gridLayoutManager;
    private AdaptadorSeguridadRV adaptadorSeguridadRV;
    private RecyclerView rv_seguridad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_seguridad);

        rv_seguridad = findViewById(R.id.rv_seguridad);
        gridLayoutManager = new GridLayoutManager(this, 2);
        rv_seguridad.setLayoutManager(gridLayoutManager);
        //Lista de Objetos que saldran en ReciclerView
        l_seguridad.add(new Seguridad("Nginx", "Nombre Evento 1", "Peticon HTTP GET" ));
        l_seguridad.add(new Seguridad("Apache", "Nombre Evento 2", "Peticon HTTP POST" ));
        l_seguridad.add(new Seguridad("Tomcat", "Nombre Evento 3", "Peticon HTTP PUT" ));
        l_seguridad.add(new Seguridad("Nginx", "Nombre Evento 4", "Peticon HTTP DELETE" ));
        l_seguridad.add(new Seguridad("Apache", "Nombre Evento 5", "Peticon HTTP HEAD" ));
        l_seguridad.add(new Seguridad("Tomcat", "Nombre Evento 6", "Peticon HTTP CONNECT" ));
        adaptadorSeguridadRV = new AdaptadorSeguridadRV(l_seguridad, this);
        rv_seguridad.setAdapter(adaptadorSeguridadRV);
    }
}