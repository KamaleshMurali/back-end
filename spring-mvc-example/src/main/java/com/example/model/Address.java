/**
 * 
 */
package com.example.model;

/**
 * @author kamalesh.murali
 * @since Mar 6, 2019
 */
public class Address {

    private int flatNo;
    private String street;
    private String city;
    private String state;
    private String country;

    public int getFlatNo() {
        return flatNo;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getCountry() {
        return country;
    }
    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
