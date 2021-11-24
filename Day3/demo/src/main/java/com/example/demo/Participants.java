package com.example.demo;

import java.util.List;

public class Participants {
    String name;
    String profile;
    String gender;
    List<Object> fav;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<Object> getFav() {
        return fav;
    }
    public void setFav(List<Object> fav) {
        this.fav = fav;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    double salary;
    public Participants(String name, String profile, String gender, List<Object> fav, double salary) {
        this.name = name;
        this.profile = profile;
        this.gender = gender;
        this.fav = fav;
        this.salary = salary;
    }
}
