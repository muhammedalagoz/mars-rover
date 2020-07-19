package com.mars.rover.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Position {
    private int x;
    private int y;
    private Direction direction;

    public Position rotateRight() {
        return Position.of(x, y, direction.right());
    }

    public Position rotateLeft() {
        return Position.of(x, y , direction.left());
    }

    public Position moveAhead() {
        return direction.getNewPosition(this.x, this.y, this.direction);
    }

    public boolean isWithIn(int x, int y) {
        return this.x <= x && this.y <= y;
    }

    public boolean isOutside(int x, int y) {
        return this.x >= x && this.y >= y;
    }

    public static Position of(int x, int y, Direction direction) {
        return Position.builder()
                .x(x)
                .y(y)
                .direction(direction)
                .build();
    }
}
