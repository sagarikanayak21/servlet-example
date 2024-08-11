package com.sn.model;

public class Student {
    private int sid;
    private String fName, lName, course, gender, dept, address;

    public void setSid(int sid) {
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
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getSid(){
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
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
}