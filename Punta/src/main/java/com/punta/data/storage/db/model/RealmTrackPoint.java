package com.punta.data.storage.db.model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 05-Nov-16.
 */

public class RealmTrackPoint extends RealmObject implements Serializable {

    @PrimaryKey
    private long tpID;
    private float tpLatitude;
    private float tpLongitude;
    private float wpElevation;
    private float tpGPSAccuracy;

    public long getTpID() {
        return tpID;
    }

    public void setTpID(long tpID) {
        this.tpID = tpID;
    }

    public float getTpLatitude() {
        return tpLatitude;
    }

    public void setTpLatitude(float tpLatitude) {
        this.tpLatitude = tpLatitude;
    }

    public float getTpLongitude() {
        return tpLongitude;
    }

    public void setTpLongitude(float tpLongitude) {
        this.tpLongitude = tpLongitude;
    }

    public float getWpElevation() {
        return wpElevation;
    }

    public void setWpElevation(float wpElevation) {
        this.wpElevation = wpElevation;
    }

    public float getTpGPSAccuracy() {
        return tpGPSAccuracy;
    }

    public void setTpGPSAccuracy(float tpGPSAccuracy) {
        this.tpGPSAccuracy = tpGPSAccuracy;
    }
}
