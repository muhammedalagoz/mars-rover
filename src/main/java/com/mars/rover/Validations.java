package com.mars.rover;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Validations {
    public static final String GRID_X_Y_REQUIRED = "Grid parameters required field";
    public static final String POSITION_REQUIRED = "Position parameters required field";
}
