package com.practice.day05;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Transcript {
    private List<Course> courses;

    public Transcript(Course... courses) {
        this.courses = Arrays.asList(courses);
    }
}
