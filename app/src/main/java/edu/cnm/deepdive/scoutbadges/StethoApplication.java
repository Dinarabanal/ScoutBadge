package edu.cnm.deepdive.scoutbadges;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class StethoApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }
}
