package edu.cnm.deepdive.scoutbadges.model.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import edu.cnm.deepdive.scoutbadges.model.dao.ScoutDao;
import edu.cnm.deepdive.scoutbadges.model.entities.Scout;

@Database(entities = {Scout.class}, version = 1, exportSchema = true)
public abstract class ScoutDatabase extends RoomDatabase {

  private static final String DATABASE_NAME = "scout_db";

  private static ScoutDatabase instance = null;

  public static synchronized ScoutDatabase getInstance(Context context) {

    if (instance == null) {
      instance = Room.databaseBuilder(context.getApplicationContext(),
          ScoutDatabase.class,
          DATABASE_NAME)
          .addCallback(new Callback(context.getApplicationContext()))
          .build();

    }
    return instance;
  }

  public static synchronized void forgetInstance(Context context) {
    instance = null;

  }

  public abstract ScoutDao getStudentDao();

  private static class Callback extends RoomDatabase.Callback {

    private Context context;

    public Callback(Context context) {
      this.context = context;
    }

    @Override
    public void onCreate(@NonNull SupportSQLiteDatabase db) {
      super.onCreate(db);
      new PrepopulateTask(context).execute();
    }

    @Override
    public void onOpen(@NonNull SupportSQLiteDatabase db) {
      super.onOpen(db);
    }

  }

  private static class PrepopulateTask extends AsyncTask<Void, Void, Void> {

    private Context context;

    public PrepopulateTask(Context context) {
      this.context = context;
    }

    @Override
    protected Void doInBackground(Void... voids) {
      ScoutDatabase db = getInstance(context);
     ScoutDao dao = db.getStudentDao();
     Scout scout =  new  Scout();
     scout.setLastName("Mouse");
     scout.setFirstName("Michael");
     scout.setRank("name");
      dao.insert(scout);
      forgetInstance(context);
      return null;
    }

  }

}
