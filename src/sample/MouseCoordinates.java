package sample;

import java.io.Serializable;

public class MouseCoordinates implements Serializable {
    private int mouseXcoordinate;
    private int mouseYcoordinate;
    private int mouseClickState;

    public MouseCoordinates(int x, int y, int z) {
        mouseXcoordinate = x;
        mouseYcoordinate = y;
        mouseClickState = z;
    }
    public int getXCoordinate() {
        return mouseXcoordinate;
    }
    public int getYCoordinate() {
        return mouseYcoordinate;
    }
    public int getState() {
        return mouseClickState;
    }
}
