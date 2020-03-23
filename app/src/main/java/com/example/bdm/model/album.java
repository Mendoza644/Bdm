package com.example.bdm.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Album")
public class album {


    @PrimaryKey (autoGenerate = true)
    private int id;
    private String title;
private int artistid;

    public album(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArtistid() {
        return artistid;
    }

    public void setArtistid(int artistid) {
        this.artistid = artistid;
    }
}
