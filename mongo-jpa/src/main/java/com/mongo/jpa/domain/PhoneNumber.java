package com.mongo.jpa.domain;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("PhoneNumber")
public class PhoneNumber extends BaseEntity {

    @Transient
    public static final String SEQUENCE="PN_SEQUENCE";

    private String number1;
    private String number2;

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number1='" + number1 + '\'' +
                ", number2='" + number2 + '\'' +
                '}';
    }
}
