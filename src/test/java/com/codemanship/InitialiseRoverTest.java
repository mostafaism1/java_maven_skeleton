package com.codemanship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialiseRoverTest {

    @Test
    void initialiseRoverAtGivenPositionAndDirection() {
        Rover rover = new Rover(2, 3, Direction.NORTH);

        assertEquals(2, rover.getX());
        assertEquals(3, rover.getY());
        assertEquals(Direction.NORTH, rover.getDirection());
    }
}
