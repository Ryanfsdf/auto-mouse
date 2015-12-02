package sample;

public class MouseCoordinates {
    private int mouseXcoordinate;
    private int mouseYcoordinate;
    private int mouseState;

    public MouseCoordinates(int x, int y, int z) {
        mouseXcoordinate = x;
        mouseYcoordinate = y;
        mouseState = z;
    }
    public int getXCoordinate() {
        return mouseXcoordinate;
    }
    public int getYCoordinate() {
        return mouseYcoordinate;
    }
}
