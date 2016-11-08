package com.punta.data.storage.db.model;

import java.io.Serializable;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 05-Nov-16.
 */

public class RealmLineSegment extends RealmObject implements Serializable {

    @PrimaryKey
    private long lineSegID;
    private RealmWayPoint realmWayPointStart;
    private RealmWayPoint realmWayPointEnd;
    private int lineSeqSequenceNumber;
    private String lineSeqType;
    private float lineSeqCurveRadius;
    private float lineSeqTransitionLength;
    private RealmList<RealmWayPoint> realmWayPointList;

    public long getLineSegID() {
        return lineSegID;
    }

    public void setLineSegID(long lineSegID) {
        this.lineSegID = lineSegID;
    }

    public RealmWayPoint getRealmWayPointStart() {
        return realmWayPointStart;
    }

    public void setRealmWayPointStart(RealmWayPoint realmWayPointStart) {
        this.realmWayPointStart = realmWayPointStart;
    }

    public RealmWayPoint getRealmWayPointEnd() {
        return realmWayPointEnd;
    }

    public void setRealmWayPointEnd(RealmWayPoint realmWayPointEnd) {
        this.realmWayPointEnd = realmWayPointEnd;
    }

    public int getLineSeqSequenceNumber() {
        return lineSeqSequenceNumber;
    }

    public void setLineSeqSequenceNumber(int lineSeqSequenceNumber) {
        this.lineSeqSequenceNumber = lineSeqSequenceNumber;
    }

    public String getLineSeqType() {
        return lineSeqType;
    }

    public void setLineSeqType(String lineSeqType) {
        this.lineSeqType = lineSeqType;
    }

    public float getLineSeqCurveRadius() {
        return lineSeqCurveRadius;
    }

    public void setLineSeqCurveRadius(float lineSeqCurveRadius) {
        this.lineSeqCurveRadius = lineSeqCurveRadius;
    }

    public float getLineSeqTransitionLength() {
        return lineSeqTransitionLength;
    }

    public void setLineSeqTransitionLength(float lineSeqTransitionLength) {
        this.lineSeqTransitionLength = lineSeqTransitionLength;
    }

    public RealmList<RealmWayPoint> getRealmWayPointList() {
        return realmWayPointList;
    }

    public void setRealmWayPointList(RealmList<RealmWayPoint> realmWayPointList) {
        this.realmWayPointList = realmWayPointList;
    }
}
