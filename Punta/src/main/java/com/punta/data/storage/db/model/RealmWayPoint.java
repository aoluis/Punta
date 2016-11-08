package com.punta.data.storage.db.model;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by Q on 09-Jul-16.
 */
public class RealmWayPoint extends RealmObject implements Serializable {
    //wp = RealmWayPoint
    private long wpID;
    private String wpName;
    private float wpLatitude;
    private float wpLongitude;
    private float wpElevation;
    private int wpEasting;
    private int wpNorthing;
    private String wpEntryType;
    private String wpGPSAccuracy;
    private Date wpGPSDatetime;
    private Boolean isLineVertex;
    private String wpDescription;
    private String wpNativeCRS;

    public long getWpID() {
        return wpID;
    }

    public void setWpID(long wpID) {
        this.wpID = wpID;
    }

    public String getWpName() {
        return wpName;
    }

    public void setWpName(String wpName) {
        this.wpName = wpName;
    }

    public float getWpLatitude() {
        return wpLatitude;
    }

    public void setWpLatitude(float wpLatitude) {
        this.wpLatitude = wpLatitude;
    }

    public float getWpLongitude() {
        return wpLongitude;
    }

    public void setWpLongitude(float wpLongitude) {
        this.wpLongitude = wpLongitude;
    }

    public float getWpElevation() {
        return wpElevation;
    }

    public void setWpElevation(float wpElevation) {
        this.wpElevation = wpElevation;
    }

    public int getWpEasting() {
        return wpEasting;
    }

    public void setWpEasting(int wpEasting) {
        this.wpEasting = wpEasting;
    }

    public int getWpNorthing() {
        return wpNorthing;
    }

    public void setWpNorthing(int wpNorthing) {
        this.wpNorthing = wpNorthing;
    }

    public String getWpEntryType() {
        return wpEntryType;
    }

    public void setWpEntryType(String wpEntryType) {
        this.wpEntryType = wpEntryType;
    }

    public String getWpGPSAccuracy() {
        return wpGPSAccuracy;
    }

    public void setWpGPSAccuracy(String wpGPSAccuracy) {
        this.wpGPSAccuracy = wpGPSAccuracy;
    }

    public Date getWpGPSDatetime() {
        return wpGPSDatetime;
    }

    public void setWpGPSDatetime(Date wpGPSDatetime) {
        this.wpGPSDatetime = wpGPSDatetime;
    }

    public Boolean getLineVertex() {
        return isLineVertex;
    }

    public void setLineVertex(Boolean lineVertex) {
        isLineVertex = lineVertex;
    }

    public String getWpDescription() {
        return wpDescription;
    }

    public void setWpDescription(String wpDescription) {
        this.wpDescription = wpDescription;
    }

    public String getWpNativeCRS() {
        return wpNativeCRS;
    }

    public void setWpNativeCRS(String wpNativeCRS) {
        this.wpNativeCRS = wpNativeCRS;
    }
}
