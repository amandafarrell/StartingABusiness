package www.amandafarrell.com.startingabusiness;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPagerAdapter(android.support.v4.app.FragmentManager fm, Context c) {
        super(fm);
        context = c;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new IntroFragment();
            case 1:
                return new StructureFragment();
            case 2:
                return new LegalFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return context.getResources().getString(R.string.intro_fragment_name);
            case 1:
                String page2 = "Structure";
                return page2;
            case 2:
                String page3 = "Legal";
                return page3;
            case 3:
                String page4 = "Tax";
                return page4;
            default:
                return null;
        }
    }
}
