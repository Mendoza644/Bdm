package com.example.bdm.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TrackDAO {
    @Insert
    void createTrack (track track);
@Query("SELECT * FROM track")
    LiveData<List<track>> getAlltracks();
}

