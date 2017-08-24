package com.studio.mpak.simdic.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.style.TtsSpan;

import com.studio.mpak.simdic.fragment.Tab1Fragment;

/**
 * Created by Mpak on 24.08.2017.
 */

public class TapPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TapPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Tab 1",
                "Tab 2",
                "Tab 3"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Tab1Fragment.getInstance();
            case 1:
                return Tab1Fragment.getInstance();
            case 2:
                return Tab1Fragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
