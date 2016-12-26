package am.aliteam.ali_schema;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFragment extends Fragment {

    private final int int_items = 5;
    private TabLayout tabLayout;

    public ScheduleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_schedule, container, false);
        ViewPager viewPager = (ViewPager) v.findViewById(R.id.viewpager);
        viewPager.setAdapter(new PagerAdapter(getChildFragmentManager()));

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(0);
        return v;
    }

    public void setTabLayout(TabLayout t) {
        this.tabLayout = t;
    }

    class PagerAdapter extends FragmentPagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            if (position <= int_items) {
                return new DayFragment();
            } else {
                return new DayFragment();
            }
        }

        @Override
        public int getCount() {
            return int_items;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.mon);
                case 1:
                    return getString(R.string.tue);
                case 2:
                    return getString(R.string.wed);
                case 3:
                    return getString(R.string.thu);
                case 4:
                    return getString(R.string.fri);
            }
            return null;
        }
    }

}
