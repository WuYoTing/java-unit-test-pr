package com.practice.tdd.ex1;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MagnetoEffectTest {
    @Test
    void noArchor() {
        // Arrange
        Point before = new Point(49, 50);
        MagnetoEffect magnetoEffect = new MagnetoEffect();
        // Act
        Point actual = magnetoEffect.check(before);
        // Assert
        Assertions.assertEquals(new Point(49, 50), actual);
    }

    @Test
    void oneNearArchor() {
        // Arrange
        Point before = new Point(49, 50);
        MagnetoEffect magnetoEffect = new MagnetoEffect();
        magnetoEffect.addAnchor(new Point(50, 50));
        // Act
        Point actual = magnetoEffect.check(before);
        // Assert
        Assertions.assertEquals(new Point(50, 50), actual);
    }
}