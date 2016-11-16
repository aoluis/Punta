package com.punta.domain.model;

import com.punta.domain.model.base.AbstractModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Q on 09-Jul-16.
 */
public class PuntaJob extends AbstractModel implements Serializable {

    private long jobID;
    private String jobName;
    private Date jobCreateDate;
    private String jobOwner;
    private String jobPinStatus;
    private String jobDescription;
    private List<PuntaWayPoint> waypointsList;
    private List<PuntaLine> realmLineList;
    private List<PuntaPolygon> polygonsList;
    private List<PuntaTrack> tracksList;

    public PuntaJob() {

    }

    public PuntaJob(long jobID, String jobName, Date jobCreateDate, String jobOwner, String jobPinStatus, String jobDescription, List<PuntaWayPoint> waypointsList, List<PuntaLine> realmLineList, List<PuntaPolygon> polygonsList, List<PuntaTrack> tracksList) {
        this.jobID = jobID;
        this.jobName = jobName;
        this.jobCreateDate = jobCreateDate;
        this.jobOwner = jobOwner;
        this.jobPinStatus = jobPinStatus;
        this.jobDescription = jobDescription;
        this.waypointsList = waypointsList;
        this.realmLineList = realmLineList;
        this.polygonsList = polygonsList;
        this.tracksList = tracksList;
    }


    public long getJobID() {
        return jobID;
    }

    public void setJobID(long jobID) {
        this.jobID = jobID;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Date getJobCreateDate() {
        return jobCreateDate;
    }

    public void setJobCreateDate(Date jobCreateDate) {
        this.jobCreateDate = jobCreateDate;
    }

    public String getJobOwner() {
        return jobOwner;
    }

    public void setJobOwner(String jobOwner) {
        this.jobOwner = jobOwner;
    }

    public String getJobPinStatus() {
        return jobPinStatus;
    }

    public void setJobPinStatus(String jobPinStatus) {
        this.jobPinStatus = jobPinStatus;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public List<PuntaWayPoint> getWaypointsList() {
        return waypointsList;
    }

    public void setWaypointsList(List<PuntaWayPoint> waypointsList) {
        this.waypointsList = waypointsList;
    }

    public List<PuntaLine> getRealmLineList() {
        return realmLineList;
    }

    public void setRealmLineList(List<PuntaLine> realmLineList) {
        this.realmLineList = realmLineList;
    }

    public List<PuntaPolygon> getPolygonsList() {
        return polygonsList;
    }

    public void setPolygonsList(List<PuntaPolygon> polygonsList) {
        this.polygonsList = polygonsList;
    }

    public List<PuntaTrack> getTracksList() {
        return tracksList;
    }

    public void setTracksList(List<PuntaTrack> tracksList) {
        this.tracksList = tracksList;
    }
}
