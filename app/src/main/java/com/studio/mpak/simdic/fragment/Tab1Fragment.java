package com.studio.mpak.simdic.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.studio.mpak.simdic.R;

/**
 * Created by Mpak on 24.08.2017.
 */

public class Tab1Fragment extends Fragment {

    private final static int LAYOUT = R.layout.tab1_fragment;
    private View view;

    public static Tab1Fragment getInstance() {
        Bundle args = new Bundle();
        Tab1Fragment fragment = new Tab1Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);



        return view;
    }
}
