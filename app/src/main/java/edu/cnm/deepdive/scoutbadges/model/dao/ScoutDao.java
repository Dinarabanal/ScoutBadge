package edu.cnm.deepdive.scoutbadges.model.dao;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import edu.cnm.deepdive.scoutbadges.model.entities.Scout;

@Dao
public interface ScoutDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  long insert (Scout scout);


}
