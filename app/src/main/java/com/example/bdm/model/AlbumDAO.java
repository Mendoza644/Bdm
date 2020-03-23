package com.example.bdm.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AlbumDAO {

    @Insert
    void createAlbum ( album album);

    @Query("SELECT * FROM album")
    LiveData<List<album>> getAllalbums();

}
