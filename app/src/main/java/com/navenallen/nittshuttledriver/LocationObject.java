package com.navenallen.nittshuttledriver;

/**
 * Created by navenallen on 14/7/17.
 */

public class LocationObject {
    private double lng;
    private double lat;

    public LocationObject(double lat, double lng){
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng(){
        return lng;
    }
}
