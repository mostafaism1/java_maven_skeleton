package com.codemanship;

public class Rover {

    private Point position;
    private final Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.position = new Point(x, y);
        this.direction = direction;
    }

    public Point getPosition() {
        return position;
    }

    public int getX() {
        return position.x();
    }

    public int getY() {
        return position.y();
    }

    public Direction getDirection() {
        return direction;
    }

    public void execute(String commands) {
        for (char command : commands.toCharArray()) {
            if (command == 'F') {
                position = switch (direction) {
                    case NORTH -> position.translate(0, 1);
                    case SOUTH -> position.translate(0, -1);
                    case EAST  -> position.translate(1, 0);
                    case WEST  -> position.translate(-1, 0);
                };
            } else if (command == 'B') {
                position = switch (direction) {
                    case NORTH -> position.translate(0, -1);
                    case SOUTH -> position.translate(0, 1);
                    case EAST  -> position.translate(-1, 0);
                    case WEST  -> position.translate(1, 0);
                };
            }
        }
    }
}
