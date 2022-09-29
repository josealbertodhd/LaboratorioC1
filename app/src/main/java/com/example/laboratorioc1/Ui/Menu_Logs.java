package com.example.laboratorioc1.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.laboratorioc1.Modelos.Logs;
import com.example.laboratorioc1.R;

import java.util.LinkedList;

public class Menu_Logs extends AppCompatActivity {
    private LinkedList<Logs> logs = new LinkedList<>();
    RecyclerView rv_menu_logs;
    AdaptadorLogsRV adaptadorLogsRV;
    GridLayoutManager gridLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_logs);
        rv_menu_logs = findViewById(R.id.rv_menu_logs);
        gridLayoutManager = new GridLayoutManager(this,2);
        rv_menu_logs.setLayoutManager(gridLayoutManager);

        logs.add(new Logs("Nginx", "09:17:59 30/11/2021",
                "AndresUser", "Exitosa"));

        logs.add(new Logs("Apache", "03:19:05 05/09/2021",
                "CamiloUser", "Fallida"));

        logs.add(new Logs("Tomcat", "05:32:12 08/12/2021",
                "JoseUser", "Fallida"));

        logs.add(new Logs("Nginx", "09:17:59 30/11/2021",
                "AndresUser", "Exitosa"));

        logs.add(new Logs("Apache", "03:19:05 05/09/2021",
                "CamiloUser", "Exitosa"));

        logs.add(new Logs("Tomcat", "05:32:12 08/12/2021",
                "JoseUser", "Fallida"));

        adaptadorLogsRV = new AdaptadorLogsRV(logs);
        rv_menu_logs.setAdapter(adaptadorLogsRV);



    }
}