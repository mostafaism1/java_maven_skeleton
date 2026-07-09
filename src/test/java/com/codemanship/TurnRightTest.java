package com.codemanship;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnRightTest {

    @ParameterizedTest(name = "Facing {0}: rover turns right to face {1}")
    @CsvSource({
        "NORTH, EAST",
        "EAST,  SOUTH",
        "SOUTH, WEST",
        "WEST,  NORTH"
    })
    void turningRightUpdatesHeadingWithoutChangingPosition(Direction startDirection, Direction endDirection) {
        Rover rover = new Rover(1, 1, startDirection);

        rover.execute("R");

        assertEquals(endDirection, rover.getDirection());
        assertEquals(1, rover.getX());
        assertEquals(1, rover.getY());
    }
}
