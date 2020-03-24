package com.example.bdm;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.bdm.model.BDMTaller;
import com.example.bdm.model.artist;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*
    ESTO SIEMPRE LO PONES ASÍ.
    SIEMPRE DEBE DE LLEVAR ESA ESTRUCTURA.
    */
    public static synchronized BDMTaller getInstance(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(), BDMTaller.class, "Taller2")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Crear la instancia*/
        BDMTaller database = getInstance(this);
        artist artist = new artist("Bad Bunny");
        database.artistDAO().createArtist(artist);

        /* Datos ingresados desde la base de datos*/
        List<artist> bd = database.artistDAO().getAllartists();

        /* Aqui conecté el spiner*/
        Spinner spinner = findViewById(R.id.spinner_artist);

        /*Estoy llenando el spinner*/
        ArrayAdapter artistAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, bd);
        artistAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Cargo el spinner con los datos
        spinner.setAdapter(artistAdapter);

    }


}
