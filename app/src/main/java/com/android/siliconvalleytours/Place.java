package com.android.siliconvalleytours;

/**
 * Created by sangeetha_gsk on 7/1/18.
 */

public class Place {
    private String name;
    private String details;
    private int imageId;

    public Place(String name, String details, int imageId) {
        this.name = name;
        this.details = details;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}