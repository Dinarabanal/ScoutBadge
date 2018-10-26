package edu.cnm.deepdive.scoutbadges;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter {

  private final List<Fragment> FragmentList = new ArrayList<>();
  private final List<String> FragmentTitleList = new ArrayList<>();

  public SectionsStatePagerAdapter(FragmentManager f) {
    super(f);
  }
  private void addFragment(Fragment fragment, String title) {
    FragmentList.add(fragment);
    FragmentTitleList.add(title);
  }



  @Override
  public int getCount() {
    return FragmentList.size();
  }

  @Override
  public Fragment getItem(int position) {
    return FragmentList. get(position);
  }
}
