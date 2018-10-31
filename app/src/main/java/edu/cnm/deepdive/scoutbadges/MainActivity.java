package edu.cnm.deepdive.scoutbadges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {

  private ImageButton ScoutButton;
  private ImageButton BadgeButton;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ScoutButton = (ImageButton) findViewById(R.id.scout);
    ScoutButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        getSupportFragmentManager().beginTransaction().replace(R.id.scout_layout, new ScoutFragment()).addToBackStack("scoutlayout").commit();

      }
    });

    BadgeButton = (ImageButton) findViewById(R.id.badge);
    BadgeButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        getSupportFragmentManager().beginTransaction().replace(R.id.badge_layout, new BadgeFragment()).addToBackStack("badgelayout").commit();
      }
    });


  }


  }

