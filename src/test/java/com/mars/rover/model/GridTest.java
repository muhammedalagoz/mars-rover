package com.mars.rover.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {

    @Test
    public void shouldReturnTrueIfAMoveIsValid() {
        final var grid = createGrid();
        final var position = Position.of(1, 2, Direction.N);

        assertTrue(grid.isValidMove(position));
    }

    @Test
    public void shouldReturnFalseIfAMoveIsInvalid() {
        final var grid = createGrid();

        final var position1 = Position.of(1, 6, Direction.N);
        final var position2 = Position.of(-1, -6, Direction.N);

        assertFalse(grid.isValidMove(position1));
        assertFalse(grid.isValidMove(position2));
    }

    private Grid createGrid() {
        return Grid.builder().x(5).y(5).build();
    }
}
