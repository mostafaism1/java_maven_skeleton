package com.codemanship;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnLeftTest {

    @ParameterizedTest(name = "Facing {0}: rover turns left to face {1}")
    @CsvSource({
        "NORTH, WEST",
        "WEST,  SOUTH",
        "SOUTH, EAST",
        "EAST,  NORTH"
    })
    void turningLeftUpdatesHeadingWithoutChangingPosition(Direction startDirection, Direction endDirection) {
        Rover rover = new Rover(1, 1, startDirection);

        rover.execute("L");

        assertEquals(endDirection, rover.getDirection());
        assertEquals(1, rover.getX());
        assertEquals(1, rover.getY());
    }
}
