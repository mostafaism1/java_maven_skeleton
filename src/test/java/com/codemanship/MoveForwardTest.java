package com.codemanship;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveForwardTest {

    @ParameterizedTest(name = "Facing {0}: rover at (1,1) moves to ({1},{2})")
    @CsvSource({
        "NORTH, 1, 2"
    })
    void movingForwardChangesPositionBasedOnHeading(Direction direction, int expectedX, int expectedY) {
        Rover rover = new Rover(1, 1, direction);

        rover.execute("F");

        assertEquals(expectedX, rover.getX());
        assertEquals(expectedY, rover.getY());
    }
}
