package edu.cnm.deepdive.scoutbadges;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BadgeFragment extends android.support.v4.app.Fragment {


  public BadgeFragment() {

  }


  @Override

  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_badges, container, false);

    return view;

  }

  }

