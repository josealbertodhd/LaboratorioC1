package com.example.laboratorioc1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.laboratorioc1.Ui.Menu_Eventos;
import com.example.laboratorioc1.Ui.Menu_Logs;
import com.example.laboratorioc1.Ui.Menu_Seguridad;

public class MainActivity extends AppCompatActivity {
    private CardView cv_menu_eventos, cv_menu_seguridad, cv_menu_logs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Quitar AppBar

        getSupportActionBar().hide();

        //Referenciar a los cardview de la vista principal

        cv_menu_eventos = findViewById(R.id.cv_menu_eventos);
        cv_menu_seguridad = findViewById(R.id.cv_menu_seguridad);
        cv_menu_logs = findViewById(R.id.cv_menu_logs);

        //Cuando se presionan los cardviews se redirige a otra activity

        cv_menu_seguridad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new IntentTask("Seguridad").execute();
            }
        });

        cv_menu_logs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new IntentTask("Logs").execute();
            }
        });

        cv_menu_eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new IntentTask("Eventos").execute();
            }
        });
    }

    //Uso de Asyntask para hacer intents y dirigirnos a otros activitys

    class IntentTask extends AsyncTask<String, Void, String>{

        String activityContext;

        public IntentTask(String activityContext) {
            this.activityContext = activityContext;
        }

        @Override
        protected void onPreExecute() {
            Toast.makeText(MainActivity.this, "Cargando...", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected String doInBackground(String... strings) {
            try {
                Intent intent;
                if (activityContext.equals("Eventos") ){
                    intent = new Intent(MainActivity.this, Menu_Eventos.class);
                }else if(activityContext.equals("Logs")){
                    intent = new Intent(MainActivity.this, Menu_Logs.class);
                }else{
                    intent = new Intent(MainActivity.this, Menu_Seguridad.class);
                }
                startActivity(intent);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            Toast.makeText(MainActivity.this, "Cargado ;)", Toast.LENGTH_SHORT).show();
        }
    }
}