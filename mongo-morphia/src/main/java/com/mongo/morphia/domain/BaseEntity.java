package com.mongo.morphia.domain;

import org.bson.types.ObjectId;
import xyz.morphia.annotations.Id;
import xyz.morphia.annotations.Property;

import java.io.Serializable;


public abstract class BaseEntity implements Serializable {

    @Id
    @Property("id")
    private String id = new ObjectId().toHexString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
