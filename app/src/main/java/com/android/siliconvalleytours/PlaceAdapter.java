package com.android.siliconvalleytours;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by sangeetha_gsk on 7/1/18.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    ArrayList<Place> places;

    public PlaceAdapter(@NonNull Context context, ArrayList<Place> places) {
        super(context, 0, places);
        this.places = places;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_places, parent, false);
        }
        // Find the TextView in the list_places.xml layout with the ID name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        //if name value is null or empty, set the visibility to GONE.
        if (places.get(position).getName() != null || !places.get(position).getName().equals("")) {
            // set this name text
            nameTextView.setText(places.get(position).getName());
        } else {
            nameTextView.setVisibility(View.GONE);
        }
        // Find the TextView in the list_places.xml layout with the ID details
        TextView details = (TextView) listItemView.findViewById(R.id.details);
        //if details value is null or empty, set the visibility to GONE.
        if (places.get(position).getDetails() != null || !places.get(position).getDetails().equals("")) {
            // set this details text
            details.setText(places.get(position).getDetails());
        } else {
            details.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_places.xml layout with the ID imageId
        ImageView imageId = (ImageView) listItemView.findViewById(R.id.imageId);
        // Find the imageview in the list_places.xml layout with the ID imageId
        //if name image resource value is  0, set the visibility to GONE.
        if (places.get(position).getImageId() != 0) {
            // set this image id
            imageId.setImageResource(places.get(position).getImageId());
        } else {
            imageId.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 2 TextViews and 1 ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}