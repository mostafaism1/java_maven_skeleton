package com.codemanship;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveBackwardTest {

    @ParameterizedTest(name = "Facing {0}: rover at (1,1) moves backward to ({1},{2})")
    @CsvSource({
        "NORTH, 1, 0",
        "EAST,  0, 1",
        "SOUTH, 1, 2",
        "WEST,  2, 1"
    })
    void movingBackwardChangesPositionOppositeToHeading(Direction direction, int expectedX, int expectedY) {
        Rover rover = new Rover(1, 1, direction);

        rover.execute("B");

        assertEquals(expectedX, rover.getX());
        assertEquals(expectedY, rover.getY());
    }
}
