package com.punta.data.storage.db.model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 05-Nov-16.
 */

public class RealmCRS extends RealmObject implements Serializable {

    @PrimaryKey
    private long pcID;
    private String pcName;
    private String pcType;
    private String pcEPSG;
    private String pcDescription;

    public long getPcID() {
        return pcID;
    }

    public void setPcID(long pcID) {
        this.pcID = pcID;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public String getPcType() {
        return pcType;
    }

    public void setPcType(String pcType) {
        this.pcType = pcType;
    }

    public String getPcEPSG() {
        return pcEPSG;
    }

    public void setPcEPSG(String pcEPSG) {
        this.pcEPSG = pcEPSG;
    }

    public String getPcDescription() {
        return pcDescription;
    }

    public void setPcDescription(String pcDescription) {
        this.pcDescription = pcDescription;
    }
}
