package edu.cnm.deepdive.scoutbadges.controller;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import edu.cnm.deepdive.scoutbadges.BadgeFragment;
import edu.cnm.deepdive.scoutbadges.R;
import edu.cnm.deepdive.scoutbadges.ScoutFragment;


public class MainActivity extends AppCompatActivity {


  private ImageButton ScoutButton;
  private ImageButton BadgeButton;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ScoutButton = (ImageButton) findViewById(R.id.scout_button);
    ScoutButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
            new ScoutFragment()).addToBackStack("scoutlayout").commit();

      }
    });

    BadgeButton = (ImageButton) findViewById(R.id.badge_button);
    BadgeButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
            new BadgeFragment()).addToBackStack("badgelayout").commit();
      }
    });


  }
}

