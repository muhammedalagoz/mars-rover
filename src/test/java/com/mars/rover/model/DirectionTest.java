package com.mars.rover.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @Test
    void shouldReturnLeft() {
        assertEquals(Direction.E, Direction.S.left());
        assertEquals(Direction.W, Direction.N.left());
    }

    @Test
    void shouldReturnRight() {
        assertEquals(Direction.W, Direction.S.right());
        assertEquals(Direction.E, Direction.N.right());
    }
}
