package com.punta.data.storage.db.model;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 09-Jul-16.
 */
public class RealmLine extends RealmObject implements Serializable {

    @PrimaryKey
    private int lineID;
    private String lineName;
    private Date lineCreateDate;
    private String lineEntryType;
    private long lineJob;
    private Boolean isLineSideOfPolygon;
    private long linePolygonID;
    private int linePolygonSequenceNumber;
    private String lineDescription;
    private RealmList<RealmLineSegment> realmLineSegmentsList;

    public int getlineID() {
        return lineID;
    }

    public void setLineID(int lineID) {
        this.lineID = lineID;
    }

    public RealmList<RealmLineSegment> getRealmLineSegmentsList() {
        return realmLineSegmentsList;
    }

    public void setRealmLineSegmentsList(RealmList<RealmLineSegment> realmLineSegmentsList) {
        this.realmLineSegmentsList = realmLineSegmentsList;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public Date getLineCreateDate() {
        return lineCreateDate;
    }

    public void setLineCreateDate(Date lineCreateDate) {
        this.lineCreateDate = lineCreateDate;
    }

    public String getLineEntryType() {
        return lineEntryType;
    }

    public void setLineEntryType(String lineEntryType) {
        this.lineEntryType = lineEntryType;
    }

    public long getLineJob() {
        return lineJob;
    }

    public void setLineJob(long lineJob) {
        this.lineJob = lineJob;
    }

    public Boolean getLineSideOfPolygon() {
        return isLineSideOfPolygon;
    }

    public void setLineSideOfPolygon(Boolean lineSideOfPolygon) {
        isLineSideOfPolygon = lineSideOfPolygon;
    }

    public long getLinePolygonID() {
        return linePolygonID;
    }

    public void setLinePolygonID(long linePolygonID) {
        this.linePolygonID = linePolygonID;
    }

    public int getLinePolygonSequenceNumber() {
        return linePolygonSequenceNumber;
    }

    public void setLinePolygonSequenceNumber(int linePolygonSequenceNumber) {
        this.linePolygonSequenceNumber = linePolygonSequenceNumber;
    }

    public String getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(String lineDescription) {
        this.lineDescription = lineDescription;
    }
}
