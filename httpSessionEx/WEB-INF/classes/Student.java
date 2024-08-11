package com.msc.vo;

public class Student {
  private String userName, userId, fName, lName, degree, dob;

  public Student() { }
  public Student(String userName, String userId, String fName, String lName, String degree, String dob) {
    this.userName = userName;
    this.userId = userId;
    this.fName = fName;
    this.lName = lName;
    this.degree = degree;
    this.dob = dob;
   }

  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getUserName() {
    return userName;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
  public String getUserId() {
    return userId;
  }

  public void setFName(String fName) {
    this.fName = fName;
  }
  public String getFName() {
    return fName;
  }

  public void setLName(String lName) {
    this.lName = lName;
  }
  public String getLName() {
    return lName;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }
  public String getDegree() {
    return degree;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }
  public String getDob() {
    return dob;
  }

}