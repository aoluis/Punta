package com.punta.data.storage.db.model;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 05-Nov-16.
 */

public class RealmBenchMark extends RealmObject implements Serializable {

    @PrimaryKey
    private long bmID;
    private String bmName;
    private int bmNorthing;
    private int bmEasting;
    private float bmElevation;
    private String bmType;
    private String ISNO;
    private String bmEstablishedBy;
    private String bmEstablishDate;
    private float bmAccuracyXY;
    private float bmAccuracyZ;
    private String bmNativeCRS;
    private String bmUploadedBy;
    private String bmVerifiedBy;
    private Date bmVerifiedDate;
    private String bmVerificationStatus;
    private float bmWGSLatitude;
    private float bmWGSLongitude;
    private float bmMapPositionError;
    private Boolean isBlacklisted;
    private String bmDescription;
    private String bmInstrumentUsed;
    private String bmClass;

    public long getBmID() {
        return bmID;
    }

    public void setBmID(long bmID) {
        this.bmID = bmID;
    }

    public String getBmName() {
        return bmName;
    }

    public void setBmName(String bmName) {
        this.bmName = bmName;
    }

    public int getBmNorthing() {
        return bmNorthing;
    }

    public void setBmNorthing(int bmNorthing) {
        this.bmNorthing = bmNorthing;
    }

    public int getBmEasting() {
        return bmEasting;
    }

    public void setBmEasting(int bmEasting) {
        this.bmEasting = bmEasting;
    }

    public float getBmElevation() {
        return bmElevation;
    }

    public void setBmElevation(float bmElevation) {
        this.bmElevation = bmElevation;
    }

    public String getBmType() {
        return bmType;
    }

    public void setBmType(String bmType) {
        this.bmType = bmType;
    }

    public String getISNO() {
        return ISNO;
    }

    public void setISNO(String ISNO) {
        this.ISNO = ISNO;
    }

    public String getBmEstablishedBy() {
        return bmEstablishedBy;
    }

    public void setBmEstablishedBy(String bmEstablishedBy) {
        this.bmEstablishedBy = bmEstablishedBy;
    }

    public String getBmEstablishDate() {
        return bmEstablishDate;
    }

    public void setBmEstablishDate(String bmEstablishDate) {
        this.bmEstablishDate = bmEstablishDate;
    }

    public float getBmAccuracyXY() {
        return bmAccuracyXY;
    }

    public void setBmAccuracyXY(float bmAccuracyXY) {
        this.bmAccuracyXY = bmAccuracyXY;
    }

    public float getBmAccuracyZ() {
        return bmAccuracyZ;
    }

    public void setBmAccuracyZ(float bmAccuracyZ) {
        this.bmAccuracyZ = bmAccuracyZ;
    }

    public String getBmNativeCRS() {
        return bmNativeCRS;
    }

    public void setBmNativeCRS(String bmNativeCRS) {
        this.bmNativeCRS = bmNativeCRS;
    }

    public String getBmUploadedBy() {
        return bmUploadedBy;
    }

    public void setBmUploadedBy(String bmUploadedBy) {
        this.bmUploadedBy = bmUploadedBy;
    }

    public String getBmVerifiedBy() {
        return bmVerifiedBy;
    }

    public void setBmVerifiedBy(String bmVerifiedBy) {
        this.bmVerifiedBy = bmVerifiedBy;
    }

    public Date getBmVerifiedDate() {
        return bmVerifiedDate;
    }

    public void setBmVerifiedDate(Date bmVerifiedDate) {
        this.bmVerifiedDate = bmVerifiedDate;
    }

    public String getBmVerificationStatus() {
        return bmVerificationStatus;
    }

    public void setBmVerificationStatus(String bmVerificationStatus) {
        this.bmVerificationStatus = bmVerificationStatus;
    }

    public float getBmWGSLatitude() {
        return bmWGSLatitude;
    }

    public void setBmWGSLatitude(float bmWGSLatitude) {
        this.bmWGSLatitude = bmWGSLatitude;
    }

    public float getBmWGSLongitude() {
        return bmWGSLongitude;
    }

    public void setBmWGSLongitude(float bmWGSLongitude) {
        this.bmWGSLongitude = bmWGSLongitude;
    }

    public float getBmMapPositionError() {
        return bmMapPositionError;
    }

    public void setBmMapPositionError(float bmMapPositionError) {
        this.bmMapPositionError = bmMapPositionError;
    }

    public Boolean getBlacklisted() {
        return isBlacklisted;
    }

    public void setBlacklisted(Boolean blacklisted) {
        isBlacklisted = blacklisted;
    }

    public String getBmDescription() {
        return bmDescription;
    }

    public void setBmDescription(String bmDescription) {
        this.bmDescription = bmDescription;
    }

    public String getBmInstrumentUsed() {
        return bmInstrumentUsed;
    }

    public void setBmInstrumentUsed(String bmInstrumentUsed) {
        this.bmInstrumentUsed = bmInstrumentUsed;
    }

    public String getBmClass() {
        return bmClass;
    }

    public void setBmClass(String bmClass) {
        this.bmClass = bmClass;
    }
}
