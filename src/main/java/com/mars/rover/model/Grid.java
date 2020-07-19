package com.mars.rover.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Grid {
    private int x;
    private int y;

    public boolean isValidMove(Position position) {
        return position.isWithIn(x, y) && position.isOutside(0, 0);
    }
}
