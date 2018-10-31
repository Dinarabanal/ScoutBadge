package edu.cnm.deepdive.scoutbadges;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



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
    return inflater.inflate(R.layout.fragment_scouts, container, false);
  }


}
