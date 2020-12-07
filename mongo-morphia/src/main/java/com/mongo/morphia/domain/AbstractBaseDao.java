package com.mongo.morphia.domain;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.morphia.Datastore;

public abstract class AbstractBaseDao {

    @Autowired
    protected Datastore ds;

}
