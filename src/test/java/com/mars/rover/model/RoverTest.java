package com.mars.rover.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    private Rover rover;

    @BeforeEach
    public void setUp() {
        final var grid = Grid.builder().x(5).y(5).build();
        rover = Rover.of(grid, Position.of(1, 2, Direction.N));
    }

    @Test
    public void shouldTurnRight() {
        final var position = Position.of(1, 2, Direction.E);

        rover.action(Instruction.R);

        assertEquals(position, rover.getPosition());
    }

    @Test
    public void shouldTurnLeft() {
        final var position = Position.of(1, 2, Direction.W);

        rover.action(Instruction.L);

        assertEquals(position, rover.getPosition());
    }

    @Test
    public void shouldMoveForward() {
        final var position = Position.of(1, 3, Direction.N);

        rover.action(Instruction.M);

        assertEquals(position, rover.getPosition());
    }

    @Test
    public void shouldFollowMultipleInstructions() {
        final var instructions = List.of(Instruction.R, Instruction.L, Instruction.M);
        final var position = Position.of(1, 3, Direction.N);

        instructions.forEach(rover::action);

        assertEquals(position, rover.getPosition());
    }

    @Test
    void of() {
        assertEquals(rover.getGrid().getX(), 5);
        assertEquals(rover.getGrid().getY(), 5);
        assertEquals(rover.getPosition().getX(), 1);
        assertEquals(rover.getPosition().getY(), 2);
        assertEquals(rover.getPosition().getDirection(), Direction.N);
    }
}
