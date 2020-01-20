package com.example.thepranami.mytutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidUserInterface extends Fragment {
    TextView t2;


    public AndroidUserInterface() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View vv = inflater.inflate(R.layout.fragment_android_user_interface, container, false);
       // Fragment Manager
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        t2 = (TextView)vv.findViewById(R.id.tv_layouts);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidUiLayouts());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t2 = (TextView)vv.findViewById(R.id.tv_controls);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidUiControls());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t2 = (TextView)vv.findViewById(R.id.tv_eventhandling);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidEventHandling());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t2 = (TextView)vv.findViewById(R.id.tv_styletheme);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidStylesThemes());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t2 = (TextView)vv.findViewById(R.id.tv_customcomponent);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidCustomComponents());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        return vv;
    }

}
