package com.mars.rover.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructionTest {

    @Test
    void shouldApplyInstructionNorthRightEast() {
        final var grid = createGrid();
        final Position position = Position.of(1, 2, Direction.N);

        final var newPosition = Instruction.R.apply(grid, position);

        assertEquals(newPosition.getDirection(), Direction.E);
    }

    @Test
    void shouldApplyInstructionNorthLeftWest() {
        final var grid = createGrid();
        final Position position = Position.of(1, 2, Direction.N);

        final var newPosition = Instruction.L.apply(grid, position);

        assertEquals(newPosition.getDirection(), Direction.W);
    }

    private Grid createGrid() {
        return Grid.builder().x(5).y(5).build();
    }
}
