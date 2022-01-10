package com.practice.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ScholarshipServiceTest")
class ScholarshipServiceTest {

    @Nested
    @DisplayName("Calculate Test")
    class calculateTest {
        @Test
        @DisplayName("Should Receive 0")
        void shouldReceive0() {
            // Arrange
            ScholarshipService scholarshipService = new ScholarshipService();
            // Act
            int actual = scholarshipService.calculate(new Transcript());
            // Assert
            Assertions.assertEquals(0, actual);
        }

        @Test
        @DisplayName("Should Receive 10000")
        void shouldReceive10000() {
            // Arrange
            ScholarshipService scholarshipService = new ScholarshipService();
            Transcript transcript = new Transcript(
                    new Course("Algorithm", 70),
                    new Course("Computer Internet", 80),
                    new Course("Operating System", 90)
            );
            // Act
            int actual = scholarshipService.calculate(transcript);
            // Assert
            assertEquals(actual, 10000);
        }

        @Test
        @DisplayName("Should Receive 5000")
        void shouldReceive5000() {
            // Arrange
            ScholarshipService scholarshipService = new ScholarshipService();
            Transcript transcript = new Transcript(
                    new Course("Algorithm", 70),
                    new Course("Computer Internet", 70),
                    new Course("Operating System", 90)
            );
            // Act
            int actual = scholarshipService.calculate(transcript);
            // Assert
            assertEquals(actual, 5000);
        }

        @Test
        @DisplayName("Should Receive Nothing")
        void shouldReceiveNothing() {
            // Arrange
            ScholarshipService scholarshipService = new ScholarshipService();
            Transcript transcript = new Transcript(
                    new Course("Algorithm", 70),
                    new Course("Computer Internet", 70),
                    new Course("Operating System", 70)
            );
            // Act
            int actual = scholarshipService.calculate(transcript);
            // Assert
            assertEquals(actual, 0);
        }
    }
}