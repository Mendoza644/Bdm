package com.example.bdm.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TrackDAO {
    @Insert
    void createTrack (track track);
@Query("SELECT * FROM track")
    List<track>getAlltracks();

@Update  void update(track track);

    @Delete
    void delete(track track);

}

