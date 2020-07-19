package com.mars.rover.service;

import com.mars.rover.model.Grid;
import com.mars.rover.model.Instruction;
import com.mars.rover.model.Position;
import com.mars.rover.model.Rover;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarsRoverService {

    public Position process(Grid grid, Position position, List<Instruction> instructions) {
        val rover = Rover.of(grid, position);
        instructions.forEach(rover::action);

        return rover.getPosition();
    }
}
