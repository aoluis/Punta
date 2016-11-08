package com.punta.data.storage.db.model;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 05-Nov-16.
 */

public class RealmUser extends RealmObject implements Serializable {

    @PrimaryKey
    private long userID;
    private String userName;
    private String userProfession;
    private Date userDateJoined;
    private String userAboutMe;
    private String userTelephone;
    private String userEmail;
    private RealmList<RealmJob> realmJobs;

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

    public RealmList<RealmJob> getRealmJobs() {
        return realmJobs;
    }

    public void setRealmJobs(RealmList<RealmJob> realmJobs) {
        this.realmJobs = realmJobs;
    }
}
