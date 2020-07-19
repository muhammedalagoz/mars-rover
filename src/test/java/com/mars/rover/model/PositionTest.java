package com.mars.rover.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    private Position positionNorth;
    private Position positionEast;

    @BeforeEach
    public void initPositions() {
        positionNorth = Position.of(0,0, Direction.N);
        positionEast = Position.of(0,0, Direction.E);
    }
    
    @Test
    public void shouldTurnRight() {
        assertEquals(Position.of(0,0, Direction.E), positionNorth.rotateRight());
        assertEquals(Position.of(0,0, Direction.S), positionEast.rotateRight());
    }

    @Test
    public void shouldTurnLeft() {
        assertEquals(Position.of(0,0, Direction.W), positionNorth.rotateLeft());
        assertEquals(Position.of(0,0, Direction.N), positionEast.rotateLeft());
    }

    @Test
    public void shouldMoveAhead() {
        assertEquals(Position.of(0,1, Direction.N), positionNorth.moveAhead());
        assertEquals(Position.of(1,0, Direction.E), positionEast.moveAhead());
    }

    @Test
    public void shouldReturnTrueWhenPositionIsInsideGivenCoordinates() {
        final var position = Position.of(1, 2, Direction.N);

        assertTrue(position.isWithIn(5, 5));
    }

    @Test
    public void shouldReturnFalseWhenPositionIsNotInsideGivenCoordinates() {
        final var position = Position.of(6, 2, Direction.N);

        assertFalse(position.isWithIn(5, 5));
    }
    @Test
    public void shouldReturnTrueWhenPositionIsOutsideGivenCoordinates() {
        final var position = Position.of(1, 2, Direction.N);

        assertTrue(position.isOutside(0, 0));
    }

    @Test
    public void shouldReturnFalseWhenPositionIsNotOutsideGivenCoordinates() {
        final var position = Position.of(-1, 2, Direction.N);

        assertFalse(position.isOutside(0, 0));
    }

    @Test
    void of() {
        final var position = Position.of(0, 0, Direction.N);

        assertEquals(position.getX(), 0);
        assertEquals(position.getY(), 0);
        assertEquals(position.getDirection(), Direction.N);
    }
}
