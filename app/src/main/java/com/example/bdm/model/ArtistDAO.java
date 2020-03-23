package com.example.bdm.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ArtistDAO {
    @Insert
    void createArtist (artist artist);

    @Query("SELECT * FROM  ARTIST")
    LiveData<List<artist>> getAllartists();
}
