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
public class AndroidBasics extends Fragment {
    TextView t1;

    public AndroidBasics() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View vv = inflater.inflate(R.layout.fragment_android_basics, container, false);

        t1 = (TextView)vv.findViewById(R.id.tv_overview);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidOverview());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_environment);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidEnvironmentSetup());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_architecture);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidArchitecture());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_component);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidApplicationComponent());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_resources);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidResource());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_activities);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidActivities());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_services);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidServices());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_receivers);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidBroadcastReceivers());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_providers);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidContentProviders());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_fragments);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidFragments());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_filters);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidIntentFilter());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t1 = (TextView)vv.findViewById(R.id.tv_example);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AndroidHelloWorld());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        return vv;
    }

}
