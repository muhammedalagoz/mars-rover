package com.mars.rover.controller;

import com.mars.rover.model.Direction;
import com.mars.rover.Validations;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositionRequest {

    @NotNull(message = Validations.POSITION_REQUIRED)
    private int x;

    @NotNull(message = Validations.POSITION_REQUIRED)
    private int y;

    @NotNull(message = Validations.POSITION_REQUIRED)
    private Direction direction;
}
