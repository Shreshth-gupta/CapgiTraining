package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${cityname}")
    private String city;
    @Value("${countryname}")
    private String country;
    @Value("${zipint}")
    private int zip;

    public Address() {
    }

    public Address(String city, String country, int zip) {
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public void setZip(int zip) {
//        this.zip = zip;
//    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getZip() {
        return zip;
    }
}
