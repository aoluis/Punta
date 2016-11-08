package com.punta.data.storage.db.model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Q on 05-Nov-16.
 */

public class RealmBenchMarkActionTrail extends RealmObject implements Serializable {
    @PrimaryKey
    private long bmatID;
}