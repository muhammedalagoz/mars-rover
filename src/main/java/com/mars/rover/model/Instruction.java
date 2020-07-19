package com.mars.rover.model;

public enum Instruction {
    R{
        @Override
        public Position apply(Grid grid, Position position) {
            return position.rotateRight();
        }
    },
    L{
        @Override
        public Position apply(Grid grid, Position position) {
            return position.rotateLeft();
        }
    },
    M{
        @Override
        public Position apply(Grid grid, Position position) {
            if(grid.isValidMove(position.moveAhead())) {
                return position.moveAhead();
            }
            return position;
        }
    };

    public abstract Position apply(Grid grid, Position position);
}
