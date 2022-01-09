package com.practice.day03;

public class Student {

  String lastName;
  String fistName;


  public Student(String lastName, String fistName) {
    this.lastName = lastName;
    this.fistName = fistName;
  }

  public String getFullName(){
    return fistName + " " + lastName;
  }
}
