package com.practice.day03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


@DisplayName("StudentTest")
public class StudentTest {


  @Test
  @DisplayName("Should Get Full Name")
  public void should_get_full_name() {
    // Arrange
    Student student = new Student("Tim", "Wu");
    // Act
    String actual = student.getFullName();
    // Assert
    assertEquals("Wu Tim", actual);
  }
}