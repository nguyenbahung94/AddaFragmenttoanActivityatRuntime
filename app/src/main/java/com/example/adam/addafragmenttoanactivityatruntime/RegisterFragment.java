package com.example.adam.addafragmenttoanactivityatruntime;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Adam on 6/10/2016.
 */
public class RegisterFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.register_fragment_layout,container,false);
    }
}
