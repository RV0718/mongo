package com.mongo.jpa.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;


public abstract class BaseEntity implements Serializable {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
