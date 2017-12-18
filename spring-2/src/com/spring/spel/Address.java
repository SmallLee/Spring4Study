package com.spring.spel;

public class Address {
    private String latitude;
    private String longtitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public Address(String latitude, String longtitude) {
        this.latitude = latitude;
        this.longtitude = longtitude;
    }
    public Address() {}

    @Override
    public String toString() {
        return "Address{" +
                "latitude='" + latitude + '\'' +
                ", longtitude='" + longtitude + '\'' +
                '}';
    }
}
