package com.mars.rover.controller;

import com.mars.rover.model.Direction;
import com.mars.rover.model.Grid;
import com.mars.rover.model.Instruction;
import com.mars.rover.model.Position;
import com.mars.rover.service.MarsRoverService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MarsRoverControllerTest {

    @InjectMocks
    private MarsRoverController marsRoverController;

    @Mock
    private MarsRoverService marsRoverService;

    @Test
    void shouldMarsRoverSolution() {
        final var request = new MarsRoverRequest();
        request.setGrid(createGridRequest());
        request.setPosition(createPositionRequest());
        request.setInstructions(createInstructions());

        when(marsRoverService.process(any(Grid.class), any(Position.class), anyList())).thenReturn(Position.of(1,3, Direction.N));

        final var marsRoverResponse = marsRoverController.solution(request);

        assertEquals(marsRoverResponse.getX(), 1);
        assertEquals(marsRoverResponse.getY(), 3);
        assertEquals(marsRoverResponse.getDirection(), Direction.N);
    }

    private List<Instruction> createInstructions() {
        return List.of(
                    Instruction.L,
                    Instruction.M,
                    Instruction.L,
                    Instruction.M,
                    Instruction.L,
                    Instruction.M,
                    Instruction.L,
                    Instruction.M,
                    Instruction.M);
    }

    private PositionRequest createPositionRequest() {
        final var position = new PositionRequest();
        position.setX(1);
        position.setY(2);
        position.setDirection(Direction.N);
        return position;
    }

    private GridRequest createGridRequest() {
        final var gridRequest = new GridRequest();
        gridRequest.setX(5);
        gridRequest.setY(5);
        return gridRequest;
    }
}
