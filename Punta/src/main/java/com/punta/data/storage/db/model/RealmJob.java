package com.punta.data.storage.db.model;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 05-Nov-16.
 */

public class RealmJob extends RealmObject implements Serializable {

    @PrimaryKey
    private long jobID;
    private String jobName;
    private Date jobCreateDate;
    private String jobOwner;
    private String jobPinStatus;
    private String jobDescription;
    private RealmList<RealmWayPoint> waypointsList;
    private RealmList<RealmLine> realmLineList;
    private RealmList<RealmPolygon> polygonsList;
    private RealmList<RealmTrack> tracksList;

    public long getjobID() {
        return jobID;
    }

    public void setjobID(long jobID) {
        this.jobID = jobID;
    }

    public String getjobName() {
        return jobName;
    }

    public void setjobName(String jobName) {
        this.jobName = jobName;
    }

    public Date getjobCreateDate() {
        return jobCreateDate;
    }

    public void setjobCreateDate(Date jobCreateDate) {
        this.jobCreateDate = jobCreateDate;
    }

    public String getjobOwner() {
        return jobOwner;
    }

    public void setjobOwner(String jobOwner) {
        this.jobOwner = jobOwner;
    }

    public String getjobPinStatus() {
        return jobPinStatus;
    }

    public void setjobPinStatus(String jobPinStatus) {
        this.jobPinStatus = jobPinStatus;
    }

    public String getjobDescription() {
        return jobDescription;
    }

    public void setjobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public RealmList<RealmWayPoint> getWaypointsList() {
        return waypointsList;
    }

    public void setWaypointsList(RealmList<RealmWayPoint> waypointsList) {
        this.waypointsList = waypointsList;
    }

    public RealmList<RealmLine> getRealmLineList() {
        return realmLineList;
    }

    public void setRealmLineList(RealmList<RealmLine> realmLineList) {
        this.realmLineList = realmLineList;
    }

    public RealmList<RealmPolygon> getPolygonsList() {
        return polygonsList;
    }

    public void setPolygonsList(RealmList<RealmPolygon> polygonsList) {
        this.polygonsList = polygonsList;
    }

    public RealmList<RealmTrack> getTracksList() {
        return tracksList;
    }

    public void setTracksList(RealmList<RealmTrack> tracksList) {
        this.tracksList = tracksList;
    }
}
