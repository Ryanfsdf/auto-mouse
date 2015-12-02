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
        mouseDoing = 3;
    }

    public void nativeMousePressed(NativeMouseEvent e) {
        System.out.println("Mouse Pressed: " + e.getButton());
        mouseDoing = 1;
    }

    public void nativeMouseReleased(NativeMouseEvent e) {
        System.out.println("Mouse Released: " + e.getButton());
        mouseDoing = 2;
    }

    public void nativeMouseMoved(NativeMouseEvent e) {
        if (mouseDoing == 0 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 0);
            mouseState.add(mouseCoordinate);
        }
        if (mouseDoing == 1 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 1);
            mouseState.add(mouseCoordinate);
            mouseDoing = 0;
        }
        if (mouseDoing == 2 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 2);
            mouseState.add(mouseCoordinate);
            mouseDoing = 0;
        }
        if (mouseDoing == 3 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 3);
            mouseState.add(mouseCoordinate);
            mouseDoing = 0;
        }
    }

    public void nativeMouseDragged(NativeMouseEvent e) {
        if (mouseDoing == 0 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 0);
            mouseState.add(mouseCoordinate);
        }
        if (mouseDoing == 1 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 1);
            mouseState.add(mouseCoordinate);
            mouseDoing = 0;
        }
        if (mouseDoing == 2 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 2);
            mouseState.add(mouseCoordinate);
            mouseDoing = 0;
        }
        if (mouseDoing == 3 && RecordAndPlay.isRecording) {
            mouseCoordinate = new MouseCoordinates(e.getX(), e.getY(), 3);
            mouseState.add(mouseCoordinate);
            mouseDoing = 0;
        }
    }
}
