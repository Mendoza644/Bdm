package com.example.bdm.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ArtistDAO {
    /*Para evitar valores repetidos usar esta línea*/
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void createArtist(artist artist);

    @Query("SELECT * FROM  ARTIST")
    List<artist> getAllartists();

    @Update
    void update(artist artist);

    @Delete
    void delete(artist artist);
}
