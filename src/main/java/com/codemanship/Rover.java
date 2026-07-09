package com.codemanship;

import java.util.Map;
import java.util.function.Consumer;

public class Rover {

    private static final Map<Character, Consumer<Rover>> COMMANDS = Map.of(
        'F', rover -> rover.position  = rover.direction.forward(rover.position),
        'B', rover -> rover.position  = rover.direction.backward(rover.position),
        'R', rover -> rover.direction = rover.direction.turnRight(),
        'L', rover -> rover.direction = rover.direction.turnLeft()
    );

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
            COMMANDS.getOrDefault(command, rover -> {}).accept(this);
        }
    }
}
