package com.example.bdm;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bdm.model.BDMTaller;
import com.example.bdm.model.artist;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BDMTaller.getInstance(this);
        /* datos ingresados*/
        List<artist> bd = BDMTaller.getInstance(this).artistDAO().getAllartists();
        ArrayAdapter artistAdapter;
        /* aqui conecte el spiner*/
        Spinner spinner = findViewById(R.id.spin_artist);

        spinner.setOnItemClickListener((AdapterView.OnItemClickListener) this);

        /*estoy llenando el spinner*/
        artistAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, bd);
        artistAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Cargo el spinner con los datos
        spinner.setAdapter(artistAdapter);

    }


}
