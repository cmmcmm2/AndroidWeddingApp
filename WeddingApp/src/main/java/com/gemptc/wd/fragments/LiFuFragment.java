package com.gemptc.wd.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.wedding.R;

/**
 * Created by Gemptc on 2016/5/19.
 */
public class LiFuFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.tab_lifu, container, false);
    }
}
