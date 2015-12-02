package sample;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

import java.util.ArrayList;
import java.util.List;


public class MouseListener implements NativeMouseInputListener {

    public static List<MouseCoordinates> mouseState = new ArrayList<>();
    public static List<MouseCoordinates> savedMouseState = new ArrayList<>();
    public static MouseCoordinates mouseCoordinate;
    //0 is moving, 1 is pressed, 2 is released
    int mouseDoing = 0;

    public void nativeMouseClicked(NativeMouseEvent e) {
        System.out.println("Mouse Clicked: " + e.getClickCount());
    }

    public void nativeMousePressed(NativeMouseEvent e) {
        System.out.println("Mouse Pressed: " + e.getButton());
        mouseDoing = 1;
        if (mouseDoing == 1 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 1);
            mouseState.add(mouseCoordinate);
        }
    }

    public void nativeMouseReleased(NativeMouseEvent e) {
        System.out.println("Mouse Released: " + e.getButton());
        mouseDoing = 0;
    }

    public void nativeMouseMoved(NativeMouseEvent e) {
        if (mouseDoing == 0 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 0);
            mouseState.add(mouseCoordinate);
            System.out.println("Mouse Moved: " + e.getX() + "," + e.getY());
        }
    }

    public void nativeMouseDragged(NativeMouseEvent e) {
    }
}
