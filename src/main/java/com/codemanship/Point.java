package com.codemanship;

public record Point(int x, int y) {

    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
}
