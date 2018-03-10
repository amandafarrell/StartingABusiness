package www.amandafarrell.com.startingabusiness;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final private int PAGE_COUNT = 6;
    private Context context;

    public SimpleFragmentPagerAdapter(android.support.v4.app.FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
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
            case 3:
                return new TaxFragment();
            case 4:
                return new FinanceFragment();
            case 5:
                return new OpenFragment();
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
                return context.getResources().getString(R.string.structure_fragment_name);
            case 2:
                return context.getResources().getString(R.string.legal_fragment_name);
            case 3:
                return context.getResources().getString(R.string.tax_fragment_name);
            case 4:
                return context.getResources().getString(R.string.finance_fragment_name);
            case 5:
                return context.getResources().getString(R.string.open_fragment_name);
            default:
                return null;
        }
    }
}
