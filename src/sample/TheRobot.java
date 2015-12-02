package sample;

import java.awt.*;

public class TheRobot {
    public static void moveMouse() {
        try {
            Robot robot = new Robot();
            for (int x = 0; x < MouseListener.savedMouseState.size() - 1; x++) {
                if (MouseListener.savedMouseState.get(x).getState() == 0) {
                    robot.delay(10);
                    robot.mouseMove(MouseListener.savedMouseState.get(x).getXCoordinate(), MouseListener.savedMouseState.get(x).getYCoordinate());
                }
                else if (MouseListener.savedMouseState.get(x).getState() == 1) {
                    robot.mousePress(16);
                    robot.mouseMove(MouseListener.savedMouseState.get(x).getXCoordinate(), MouseListener.savedMouseState.get(x).getYCoordinate());
                }
                else if (MouseListener.savedMouseState.get(x).getState() == 2) {
                    robot.mouseRelease(16);
                    robot.mouseMove(MouseListener.savedMouseState.get(x).getXCoordinate(), MouseListener.savedMouseState.get(x).getYCoordinate());
                }
                else/* if (MouseListener.savedMouseState.get(x).getState() == 3) */{
                    robot.mousePress(16);
                    robot.mouseRelease(16);
                    robot.mouseMove(MouseListener.savedMouseState.get(x).getXCoordinate(), MouseListener.savedMouseState.get(x).getYCoordinate());
                }
            }
        } catch (AWTException e) {
        }
    }
}
