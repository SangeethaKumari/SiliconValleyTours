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
 *
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places, container, false);

        final ArrayList<Place> attractionPlaces = new ArrayList<Place>();

        attractionPlaces.add(new Place(getString(R.string.attraction_name_1),getString(R.string.attraction_details_1),R.drawable.castle_rock_park));
        attractionPlaces.add(new Place(getString(R.string.attraction_name_2),getString(R.string.attraction_details_2),R.drawable.castle_rock_park));
        attractionPlaces.add(new Place(getString(R.string.attraction_name_3),getString(R.string.attraction_details_3),R.drawable.castle_rock_park));
        attractionPlaces.add(new Place(getString(R.string.attraction_name_4),getString(R.string.attraction_details_4),R.drawable.castle_rock_park));
        attractionPlaces.add(new Place(getString(R.string.attraction_name_5),getString(R.string.attraction_details_5),R.drawable.castle_rock_park));
        attractionPlaces.add(new Place(getString(R.string.attraction_name_6),getString(R.string.attraction_details_6),R.drawable.castle_rock_park));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), attractionPlaces);
        final ListView listView = (ListView) rootView.findViewById(R.id.places);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
