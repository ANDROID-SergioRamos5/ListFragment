package com.example.listfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends FragmentActivity implements OnSelectedItemListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();

        Fragment fragmentList = new FragmentList();
        FT.replace(R.id.fragment_container, fragmentList);
        FT.commit();
    }


    @Override
    public void onItemSelected(String str) {
        Fragment fragmentSecundario = new FragmentSecundario();

        Bundle args = new Bundle();

        args.putString("str", str);
        fragmentSecundario.setArguments(args);

        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.fragment_container, fragmentSecundario);
        FT.addToBackStack(null);

        FT.commit();
    }
}
