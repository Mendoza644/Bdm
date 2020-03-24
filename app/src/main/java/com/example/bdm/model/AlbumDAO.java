package com.example.bdm.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AlbumDAO {

    @Insert
    void createAlbum ( album album);

    @Query("SELECT * FROM album")
    List<album> getAllalbums();

    @Update
    void update(album album);

    @Delete
    void delete(album album);

}
