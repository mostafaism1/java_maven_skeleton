package com.codemanship;

public class Rover {

    private Point position;
    private Direction direction;

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
                position = direction.forward(position);
            } else if (command == 'B') {
                position = direction.backward(position);
            } else if (command == 'R') {
                direction = direction.turnRight();
            } else if (command == 'L') {
                direction = direction.turnLeft();
            }
        }
    }
}
