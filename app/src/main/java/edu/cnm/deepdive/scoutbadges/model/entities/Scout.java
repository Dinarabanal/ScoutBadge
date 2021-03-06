package edu.cnm.deepdive.scoutbadges.model.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
    (
        indices = {
            @Index(value = {"last_name", "first_name"}, unique = true)
        }

    )
public class Scout {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name= "scout_id")
  private long id;

  public void setFullName(@NonNull String firstNamex,@NonNull String lastNamex) {
    firstName = firstNamex;
    lastName = lastNamex;
  }

  @NonNull
  @ColumnInfo(name = "last_name", collate = ColumnInfo.NOCASE)
  private String lastName;

  @NonNull
  @ColumnInfo(name = "first_name", collate = ColumnInfo.NOCASE)
  private String firstName;

  @NonNull
  @ColumnInfo(index = true, collate = ColumnInfo.NOCASE)
  private String rank;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @NonNull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@NonNull String lastname) {
    this.lastName = lastname;
  }

  @NonNull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@NonNull String firstName) {
    this.firstName = firstName;
  }

  @NonNull
  public String getRank() {
    return rank;
  }

  public void setRank(@NonNull String rank) {
    this.rank = rank;
  }
}

