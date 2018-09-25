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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places, container, false);

        final ArrayList<Place> restaurantPlaces = new ArrayList<Place>();
        restaurantPlaces.add(new Place(getString(R.string.restaurants_name_1),getString(R.string.restaurants_details_1),0));
        restaurantPlaces.add(new Place(getString(R.string.restaurants_name_2),getString(R.string.restaurants_details_2),0));
        restaurantPlaces.add(new Place(getString(R.string.restaurants_name_3),getString(R.string.restaurants_details_3),0));
        restaurantPlaces.add(new Place(getString(R.string.restaurants_name_4),getString(R.string.restaurants_details_4),0));
        restaurantPlaces.add(new Place(getString(R.string.restaurants_name_5),getString(R.string.restaurants_details_5),0));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), restaurantPlaces);
        final ListView listView = (ListView) rootView.findViewById(R.id.places);
        listView.setAdapter(placeAdapter);
        return rootView;
    }

}