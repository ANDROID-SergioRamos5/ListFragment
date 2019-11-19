package com.example.listfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class FragmentList extends ListFragment {

    private String[] valores={"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7"};
    private OnSelectedItemListener listener;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, valores));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l,v,position,id);

        listener.onItemSelected(valores[position]);
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        try {
            listener = (OnSelectedItemListener) context;
        }catch (ClassCastException e){}
    }
}
