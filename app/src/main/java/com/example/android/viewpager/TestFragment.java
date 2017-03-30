package com.example.android.viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends Fragment {

    private String[] day = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday"};
    public static final String TEXT_VIEW_ARG = "Day";
    public TestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_test, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textview);
        int pos = getArguments().getInt(TEXT_VIEW_ARG);
        textView.setText(day[pos]);
        return view;
    }

}
