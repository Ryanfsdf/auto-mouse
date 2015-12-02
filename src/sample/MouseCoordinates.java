package sample;

import java.io.Serializable;

public class MouseCoordinates implements Serializable {
    private int mouseXCoordinate;
    private int mouseYCoordinate;
    private int mouseClickState;

    public MouseCoordinates(int x, int y, int z) {
        mouseXCoordinate = x;
        mouseYCoordinate = y;
        mouseClickState = z;
    }
    public int getXCoordinate() {
        return mouseXCoordinate;
    }
    public int getYCoordinate() {
        return mouseYCoordinate;
    }
    public int getState() {
        return mouseClickState;
    }
}
