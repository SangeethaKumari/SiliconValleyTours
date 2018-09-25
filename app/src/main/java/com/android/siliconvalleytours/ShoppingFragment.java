package com.android.siliconvalleytours;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places, container, false);

        final ArrayList<Place> shoppngPlaces = new ArrayList<Place>();
        shoppngPlaces.add(new Place(getString(R.string.shopping_name_1),getString(R.string.shopping_details_1),0));
        shoppngPlaces.add(new Place(getString(R.string.shopping_name_2),getString(R.string.shopping_details_2),0));
        shoppngPlaces.add(new Place(getString(R.string.shopping_name_3),getString(R.string.shopping_details_3),0));
        shoppngPlaces.add(new Place(getString(R.string.shopping_name_4),getString(R.string.shopping_details_4),0));
        shoppngPlaces.add(new Place(getString(R.string.shopping_name_5),getString(R.string.shopping_details_5),0));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), shoppngPlaces);
        final ListView listView = (ListView) rootView.findViewById(R.id.places);
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}