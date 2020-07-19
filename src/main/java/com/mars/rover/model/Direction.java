package com.mars.rover.model;

public enum Direction {

    E {
        @Override
        public Direction left(){
            return N;
        }

        @Override
        public Direction right(){
            return S;
        }

        @Override
        public Position getNewPosition(int x, int y, Direction direction) {
            return Position.of(x + 1, y, direction);
        }
    },

    W {
        @Override
        public Direction left(){
            return S;
        }

        @Override
        public Direction right(){
            return N;
        }

        @Override
        public Position getNewPosition(int x, int y, Direction direction) {
            return Position.of(x - 1, y, direction);
        }
    },

    N {
        @Override
        public Direction left(){
            return W;
        }

        @Override
        public Direction right(){
            return E;
        }

        @Override
        public Position getNewPosition(int x, int y, Direction direction) {
            return Position.of(x, y + 1, direction);
        }
    },

    S {
        @Override
        public Direction left(){
            return E;
        }

        @Override
        public Direction right(){
            return W;
        }

        @Override
        public Position getNewPosition(int x, int y, Direction direction) {
            return Position.of(x, y - 1, direction);
        }
    };

    public abstract Direction left();

    public abstract Direction right();

    public abstract Position getNewPosition(int x, int y, Direction direction);

}
