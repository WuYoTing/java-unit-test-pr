package com.practice.day03;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("StudentTest")
public class StudentTest {


    @Test
    @DisplayName("Should Get Full Name")
    public void shouldGetFullName() {
        // Arrange
        Student student = new Student("Tim", "Wu");
        // Act
        String actual = student.getFullName();
        // Assert
        assertEquals("Wu Tim", actual);
    }
}