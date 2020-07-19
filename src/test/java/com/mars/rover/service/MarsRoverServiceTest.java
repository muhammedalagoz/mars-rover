package com.mars.rover.service;

import com.mars.rover.model.Direction;
import com.mars.rover.model.Grid;
import com.mars.rover.model.Instruction;
import com.mars.rover.model.Position;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MarsRoverServiceTest {

    @InjectMocks
    private MarsRoverService marsRoverService;

    @Test
    void shouldMarsRoverProcess() {
        final var grid = Grid.builder().x(5).y(5).build();
        final var position = Position.of(1, 2, Direction.N);
        final var instructions = List.of(
                                    Instruction.L,
                                    Instruction.M,
                                    Instruction.L,
                                    Instruction.M,
                                    Instruction.L,
                                    Instruction.M,
                                    Instruction.L,
                                    Instruction.M,
                                    Instruction.M);

        final var newPosition = marsRoverService.process(grid, position, instructions);

        assertEquals(newPosition.getX(), 1);
        assertEquals(newPosition.getY(), 3);
        assertEquals(newPosition.getDirection(), Direction.N);
    }

}
