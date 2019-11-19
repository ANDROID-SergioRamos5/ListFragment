package com.example.listfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class FragmentSecundario extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_secundario, container, false);

        Bundle b;
        b = getArguments();
        String inf = (String)b.get("str");

        ((TextView)v.findViewById(R.id.tv_secundario)).setText(inf);
        return v;
    }
}
