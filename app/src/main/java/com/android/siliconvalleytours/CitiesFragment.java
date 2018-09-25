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
public class CitiesFragment extends Fragment {

    public CitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.cities_name_1),"",0));
        places.add(new Place(getString(R.string.cities_name_2),"",0));
        places.add(new Place(getString(R.string.cities_name_3),"",0));
        places.add(new Place(getString(R.string.cities_name_4),"",0));
        places.add(new Place(getString(R.string.cities_name_5),"",0));
        places.add(new Place(getString(R.string.cities_name_6),"",0));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);
        final ListView listView = (ListView) rootView.findViewById(R.id.places);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}