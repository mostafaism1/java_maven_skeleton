package com.codemanship;

public enum Direction {
    NORTH(0, 1),
    EAST(1, 0),
    SOUTH(0, -1),
    WEST(-1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Point forward(Point p) {
        return p.translate(dx, dy);
    }

    public Point backward(Point p) {
        return p.translate(-dx, -dy);
    }

    public Direction turnRight() {
        return values()[(ordinal() + 1) % values().length];
    }

    public Direction turnLeft() {
        return values()[(ordinal() + values().length - 1) % values().length];
    }
}
