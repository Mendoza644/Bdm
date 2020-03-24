package com.example.bdm.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "artist")


public class artist {


    @PrimaryKey (autoGenerate = true)
    private int id;
    private  String name;

    public artist(String name) {
        this.name = name;
    }
    @NonNull
    @Override
    public String toString() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
