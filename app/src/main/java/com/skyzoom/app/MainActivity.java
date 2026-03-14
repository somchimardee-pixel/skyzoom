package com.skyzoom.app;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SupportMapFragment mapFragment =
                SupportMapFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, mapFragment)
                .commit();

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        LatLng thailand = new LatLng(13.736717, 100.523186);

        mMap.moveCamera(
                CameraUpdateFactory.newLatLngZoom(thailand, 15)
        );

    }
}
