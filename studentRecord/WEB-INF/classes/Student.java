package com.sn.vo;

public class Student {
    private int sid;
    private String fName, lName, course;
    public void setSID(int sid){
        this.sid = sid;
    }
    public void setFName(String fName){
        this.fName = fName;
    }
    public void setLName(String lName){
        this.lName = lName;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public int getSID(){
        return sid;
    }
    public String getFName(){
        return fName;
    }
    public String getLName(){
        return lName;
    }
    public String getCourse(){
        return course;
    }
}
