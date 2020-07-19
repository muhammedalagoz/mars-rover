package com.mars.rover.controller;

import com.mars.rover.Validations;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GridRequest {

    @NotNull(message = Validations.GRID_X_Y_REQUIRED)
    private int x;

    @NotNull(message = Validations.GRID_X_Y_REQUIRED)
    private int y;

}
