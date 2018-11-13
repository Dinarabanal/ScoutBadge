package edu.cnm.deepdive.scoutbadges;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import edu.cnm.deepdive.scoutbadges.model.db.ScoutDatabase;
import edu.cnm.deepdive.scoutbadges.model.entities.Scout;
import java.util.ArrayList;
import java.util.List;


public class ScoutFragment extends Fragment {



  private static final String TAG = "ScoutFragment";

  public ScoutFragment() {
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_scouts, container, false);
    Scout scout = new Scout();
    scout.setLastName("John");
    new InsertTask().execute(scout);
    return view;
  }
private class InsertTask extends AsyncTask<Scout,Void,Long>{

  @Override
  protected Long doInBackground(Scout... scouts) {
    return ScoutDatabase.getInstance(getContext()).getScoutDao().insert(scouts[0]);
  }
}

}
