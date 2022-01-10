package com.practice.day05;

import java.util.List;

public class ScholarshipService {
    /**
     * Calculate Scholarship
     *
     * @param transcript
     * @return
     */
    public int calculate(Transcript transcript) {
        List<Course> courses = transcript.getCourses();
        if (courses.isEmpty()) return 0;

        int total = courses.size();
        int achieved = 0;
        for (Course course : courses) {
            if (course.getScore() >= 80) achieved++;
        }

        double rate = (double) achieved / total;
        if (rate >= (double) 1 / 2) {
            return 10000;
        } else if (rate >= (double) 1 / 3) {
            return 5000;
        } else {
            return 0;
        }
    }
}
