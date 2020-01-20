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
public class AndroidAdvanceConcept extends Fragment {
   TextView t3;

    public AndroidAdvanceConcept() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View vv = inflater.inflate(R.layout.fragment_android_advance_concept, container, false);
        // Fragment Manager
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        t3 = (TextView)vv.findViewById(R.id.tv_dragdrop);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidDragDrop());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t3 = (TextView)vv.findViewById(R.id.tv_notification);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidNotification());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t3 = (TextView)vv.findViewById(R.id.tv_locationbasedservices);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new LocationBasedServices());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t3 = (TextView)vv.findViewById(R.id.tv_email);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidSendingEmail());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t3 = (TextView)vv.findViewById(R.id.tv_sms);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidSendingSms());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t3 = (TextView)vv.findViewById(R.id.tv_phonecalls);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidPhoneCalls());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t3 = (TextView)vv.findViewById(R.id.tv_publishingapplication);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new PublishingAndroidApplication());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
       return vv;
    }

}
