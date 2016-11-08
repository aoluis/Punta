package com.punta.data.storage.db.model;

import java.io.Serializable;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 09-Jul-16.
 */
public class RealmPolygon extends RealmObject implements Serializable {

    @PrimaryKey
    private int polygonID;
    private String polygonLabel;
    private int NumberOfPolylines;
    private RealmList<RealmLine> puntaPolylinesList;

    public int getPolygonID() {
        return polygonID;
    }

    public void setPolygonID(int polygonID) {
        this.polygonID = polygonID;
    }

    public String getPolygonLabel() {
        return polygonLabel;
    }

    public void setPolygonLabel(String polygonLabel) {
        this.polygonLabel = polygonLabel;
    }

    public int getNumberOfPolylines() {
        return NumberOfPolylines;
    }

    public void setNumberOfPolylines(int numberOfPolylines) {
        NumberOfPolylines = numberOfPolylines;
    }

}
