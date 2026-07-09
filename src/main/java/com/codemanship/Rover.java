package com.codemanship;

public class Rover {

    private int x;
    private int y;
    private final Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void execute(String commands) {
        for (char command : commands.toCharArray()) {
            if (command == 'F' && direction == Direction.NORTH) {
                y++;
            }
        }
    }
}
