package com.example.bdm.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {album.class,track.class,artist.class},version = 1)
public abstract  class BDMTaller extends RoomDatabase {

    private  static BDMTaller instance;

    public abstract AlbumDAO albumDAO();
    public abstract ArtistDAO artistDAO();
    public abstract TrackDAO trackDAO();

    public static synchronized BDMTaller getInstance(Context context){
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),BDMTaller.class,"Taller2")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}

