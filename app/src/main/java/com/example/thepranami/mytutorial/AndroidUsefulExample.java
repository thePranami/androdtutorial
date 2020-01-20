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
public class AndroidUsefulExample extends Fragment {
    TextView t4;


    public AndroidUsefulExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv = inflater.inflate(R.layout.fragment_android_useful_example, container, false);

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        t4 = (TextView)vv.findViewById(R.id.tv_uiwidgets);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AndroidUiWidgets());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_buttons);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new WorkingWithButtons());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_toast);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new ToastCustomTost());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_togglebutton);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new ToggleButton());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_checkbox);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new CheckboxRadioButton());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_searchview);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new SearchView());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_alertdialog);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AlertDialog());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_spinner);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new Spinner());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_autocmplt);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AutoCompleteTextview());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_listview);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new Listview());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_bar);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new RatingbarSeekbarProgressbar());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_datetime);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new DateTimePicker());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_analogdigital);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new AnalogDigital());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_scrollview);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new Scrollview());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_imgslider);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new ImageSwitcherSlider());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_viewstub);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new Viewstub());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        t4 = (TextView)vv.findViewById(R.id.tv_tabframe);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.main_container, new TabFrameLayout());
                fragmentTransaction.addToBackStack("A");
                fragmentTransaction.commit();
            }
        });
        return vv;
    }

}
