package com.example.student;

public class Address {
  private String country;
  private String state;
  private String city;
  private String steet;
  private String pin;

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getSteet() {
    return steet;
  }

  public void setSteet(String steet) {
    this.steet = steet;
  }

  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  @Override
  public String toString() {
    return "Address [country=" + country + ", state=" + state + ", city=" + city + ", steet=" + steet + ", pin=" + pin
        + "]";
  }
}
