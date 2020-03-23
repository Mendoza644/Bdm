package com.example.bdm.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Track")
public class track {
    @PrimaryKey(autoGenerate = true)
    private  int id;
    private String name;
    private float length;
    private int albumid;

    public track(String name, float length) {
        this.name = name;
        this.length = length;
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

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getAlbumid() {
        return albumid;
    }

    public void setAlbumid(int albumid) {
        this.albumid = albumid;
    }
}
