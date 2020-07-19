package com.mars.rover.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class Rover {
    private Position position;
    private Grid grid;

    public void action(Instruction instruction) {
        position = instruction.apply(this.grid, this.position);
    }

    public static Rover of(Grid grid, Position position) {
        return Rover.builder()
                .grid(grid)
                .position(position)
                .build();
    }
}
