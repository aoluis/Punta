package com.punta.data.storage.db.model;

import java.io.Serializable;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 05-Nov-16.
 */

public class RealmTrackSegment extends RealmObject implements Serializable {

    @PrimaryKey
    private long tsID;
    private RealmTrackPoint tsStart;
    private RealmTrackPoint tsEnd;
    private RealmTrack realmTrack;
    private int tsSequence;
    private RealmList<RealmTrackPoint> realmTrackPointsList;

    public long getTsID() {
        return tsID;
    }

    public void setTsID(long tsID) {
        this.tsID = tsID;
    }

    public RealmTrackPoint getTsStart() {
        return tsStart;
    }

    public void setTsStart(RealmTrackPoint tsStart) {
        this.tsStart = tsStart;
    }

    public RealmTrackPoint getTsEnd() {
        return tsEnd;
    }

    public void setTsEnd(RealmTrackPoint tsEnd) {
        this.tsEnd = tsEnd;
    }

    public RealmTrack getRealmTrack() {
        return realmTrack;
    }

    public void setRealmTrack(RealmTrack realmTrack) {
        this.realmTrack = realmTrack;
    }

    public int getTsSequence() {
        return tsSequence;
    }

    public void setTsSequence(int tsSequence) {
        this.tsSequence = tsSequence;
    }

    public RealmList<RealmTrackPoint> getRealmTrackPointsList() {
        return realmTrackPointsList;
    }

    public void setRealmTrackPointsList(RealmList<RealmTrackPoint> realmTrackPointsList) {
        this.realmTrackPointsList = realmTrackPointsList;
    }
}
