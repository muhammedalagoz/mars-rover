package com.mars.rover.controller;

import com.mars.rover.model.Grid;
import com.mars.rover.model.Position;
import com.mars.rover.model.Instruction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarsRoverRequest {
    private GridRequest grid;
    private PositionRequest position;
    private List<Instruction> instructions;

    public Grid toGrid() {
        return Grid.builder()
                .x(this.grid.getX())
                .y(this.grid.getY())
                .build();
    }

    public Position toPosition() {
        return Position.builder()
                .x(this.position.getX())
                .y(this.position.getY())
                .direction(this.position.getDirection())
                .build();
    }
}
