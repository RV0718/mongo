package com.mongo.morphia.domain;

import xyz.morphia.annotations.Embedded;
import xyz.morphia.annotations.Entity;

import java.util.List;

@Entity("Users")
public class User extends BaseEntity{


    private String name;
    private int age;
    private String gender;

    @Embedded
    private Address address;

    @Embedded
    private List<PhoneNumber> phoneNumbers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
