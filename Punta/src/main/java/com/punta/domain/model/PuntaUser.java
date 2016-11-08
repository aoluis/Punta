package com.punta.domain.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Q on 07-Nov-16.
 */

public class PuntaUser implements Serializable {

    private long userID;
    private String userName;
    private String userProfession;
    private Date userDateJoined;
    private String userAboutMe;
    private String userTelephone;
    private String userEmail;
    private List<PuntaJob> puntaJobs;

    public PuntaUser(long userID, String userName, String userProfession, Date userDateJoined, String userAboutMe, String userTelephone, String userEmail, List<PuntaJob> puntaJobs) {
        this.userID = userID;
        this.userName = userName;
        this.userProfession = userProfession;
        this.userDateJoined = userDateJoined;
        this.userAboutMe = userAboutMe;
        this.userTelephone = userTelephone;
        this.userEmail = userEmail;
        this.puntaJobs = puntaJobs;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserProfession() {
        return userProfession;
    }

    public void setUserProfession(String userProfession) {
        this.userProfession = userProfession;
    }

    public Date getUserDateJoined() {
        return userDateJoined;
    }

    public void setUserDateJoined(Date userDateJoined) {
        this.userDateJoined = userDateJoined;
    }

    public String getUserAboutMe() {
        return userAboutMe;
    }

    public void setUserAboutMe(String userAboutMe) {
        this.userAboutMe = userAboutMe;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public List<PuntaJob> getPuntaJobs() {
        return puntaJobs;
    }

    public void setpuntaJobs(List<PuntaJob> puntaJobs) {
        this.puntaJobs = puntaJobs;
    }
}
