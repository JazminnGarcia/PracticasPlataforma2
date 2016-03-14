package com.example.ingecastro.recycler2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Titular> datos;
    RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datos = new ArrayList<>();
        datos.add(new Titular("hola"));
        datos.add(new Titular("hola2"));
        datos.add(new Titular("hola3"));
        datos.add(new Titular("hola4"));
        datos.add(new Titular("hola5"));
        datos.add(new Titular("hola6"));
        datos.add(new Titular("hola7"));
        datos.add(new Titular("hola8"));
        datos.add(new Titular("hola9"));
        datos.add(new Titular("hola10"));
        datos.add(new Titular("hola11"));
        datos.add(new Titular("hola12"));
        datos.add(new Titular("hola13"));
        datos.add(new Titular("hola14"));
        datos.add(new Titular("hola15"));
        datos.add(new Titular("hola16"));
        datos.add(new Titular("hola17"));
        datos.add(new Titular("hola18"));
        datos.add(new Titular("hola19"));
        datos.add(new Titular("hola20"));
        datos.add(new Titular("hola21"));
        datos.add(new Titular("hola22"));
        datos.add(new Titular("hola23"));
        datos.add(new Titular("hola24"));
        datos.add(new Titular("hola25"));
        datos.add(new Titular("hola26"));
        datos.add(new Titular("hola27"));
        datos.add(new Titular("hola28"));
        datos.add(new Titular("hola29"));
        datos.add(new Titular("hola30"));
        datos.add(new Titular("hola31"));
        datos.add(new Titular("hola32"));
        recView = (RecyclerView) findViewById(R.id.RecView);
        recView.setAdapter(new AdaptadorTitulares(datos));
        recView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    //Clase adaptador
    public class AdaptadorTitulares extends RecyclerView.Adapter<AdaptadorTitulares.TitularesViewHolder> {
        private ArrayList<Titular> datos;

        public AdaptadorTitulares(ArrayList<Titular> datos) {
            this.datos = datos;
        }

        @Override
        public TitularesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_titular, viewGroup, false);
            return new TitularesViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(TitularesViewHolder viewHolder, int pos) {
            viewHolder.bindTitular(datos.get(pos));
        }

        @Override
        public int getItemCount() {
            return datos.size();
        }

        public class TitularesViewHolder extends RecyclerView.ViewHolder {
            private TextView txtTitulo;

            public TitularesViewHolder(View itemView) {
                super(itemView);
                txtTitulo = (TextView) itemView.findViewById(R.id.LblTitulo);
            }

            public void bindTitular(Titular t) {
                txtTitulo.setText(t.getTitulo());
            }
        }
    }


    //clase Titular
    public class Titular {
        private String titulo;

        public Titular(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }
}
