package edu.cnm.deepdive.scoutbadges;

import android.arch.persistence.room.Room;
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

  private Button btnNavScouts;


  private String Scouts;


  public ScoutFragment() {
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_scouts, container, false);
 Scout scout = new Scout();
    ScoutDatabase db = Room.databaseBuilder(getContext()
        ,ScoutDatabase.class,"production").build();



    List<Scout> scouts = new ArrayList<>();
    scout.setFullName("bob", "joe");

    return view;
  }


}
