package com.mars.rover.controller;

import com.mars.rover.model.Direction;
import com.mars.rover.model.Position;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MarsRoverResponse {
    private int x;
    private int y;
    private Direction direction;

    public static MarsRoverResponse fromPositionResponse(Position position) {
        return MarsRoverResponse.builder()
                .x(position.getX())
                .y(position.getY())
                .direction(position.getDirection())
                .build();
    }
}
