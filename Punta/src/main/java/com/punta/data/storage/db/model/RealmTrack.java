package com.punta.data.storage.db.model;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 05-Nov-16.
 */

public class RealmTrack extends RealmObject implements Serializable {

    @PrimaryKey
    private long trackID;
    private String trackName;
    private Date trackCreateDate;
    private String trackJob;
    private RealmList<RealmTrackSegment> realmTrackSegmentsList;

    public long getTrackID() {
        return trackID;
    }

    public void setTrackID(long trackID) {
        this.trackID = trackID;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Date getTrackCreateDate() {
        return trackCreateDate;
    }

    public void setTrackCreateDate(Date trackCreateDate) {
        this.trackCreateDate = trackCreateDate;
    }

    public String getTrackJob() {
        return trackJob;
    }

    public void setTrackJob(String trackJob) {
        this.trackJob = trackJob;
    }

    public RealmList<RealmTrackSegment> getRealmTrackSegmentsList() {
        return realmTrackSegmentsList;
    }

    public void setRealmTrackSegmentsList(RealmList<RealmTrackSegment> realmTrackSegmentsList) {
        this.realmTrackSegmentsList = realmTrackSegmentsList;
    }
}
