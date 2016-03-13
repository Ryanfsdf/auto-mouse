package sample;

import java.awt.*;

public class TheRobot {
    public static void moveMouse() {
        try {
            Robot robot = new Robot();
            for (int x = 0; x < MouseListener.savedMouseState.size() - 1; x++) {
                if (MouseListener.savedMouseState.get(x).getState() == 0) {
                    try {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException ie) {
                    }

                    robot.mouseMove(MouseListener.savedMouseState.get(x).getXCoordinate(), MouseListener.savedMouseState.get(x).getYCoordinate());
                }
                else if (MouseListener.savedMouseState.get(x).getState() == 1) {
                    try {
                        Thread.sleep(275);
                    }
                    catch (InterruptedException ie) {
                    }
                    robot.mousePress(16);
                    robot.mouseMove(MouseListener.savedMouseState.get(x).getXCoordinate(), MouseListener.savedMouseState.get(x).getYCoordinate());
                }
                else if (MouseListener.savedMouseState.get(x).getState() == 2) {
                    try {
                        Thread.sleep(275);
                    }
                    catch (InterruptedException ie) {
                    }
                    robot.mouseRelease(16);
                    robot.mouseMove(MouseListener.savedMouseState.get(x).getXCoordinate(), MouseListener.savedMouseState.get(x).getYCoordinate());
                }
                else if (MouseListener.savedMouseState.get(x).getState() == 3) {
                    try {
                        Thread.sleep(275);
                    }
                    catch (InterruptedException ie) {
                    }
                    robot.mousePress(16);
                    robot.mouseRelease(16);
                    robot.mouseMove(MouseListener.savedMouseState.get(x).getXCoordinate(), MouseListener.savedMouseState.get(x).getYCoordinate());
                }
                else if (MouseListener.savedMouseState.get(x).getState() == 4) {
                    try {
                        Thread.sleep(275);
                    }
                    catch (InterruptedException ie) {
                    }
                    robot.keyPress(MouseListener.savedMouseState.get(x).getXCoordinate());
                    try {
                        Thread.sleep(275);
                    }
                    catch (InterruptedException ie) {
                    }
                    robot.keyRelease(MouseListener.savedMouseState.get(x).getXCoordinate());
                }
            }
        } catch (AWTException e) {
        }
    }
}
