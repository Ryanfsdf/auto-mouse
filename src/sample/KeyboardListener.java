package sample;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyboardListener implements NativeKeyListener {

    public void nativeKeyPressed(NativeKeyEvent e) {
        String keyChecker =  NativeKeyEvent.getKeyText(e.getKeyCode());
        if (keyChecker.equals("F12") && !RecordAndPlay.isRecording) {
            TheRobot.moveMouse();
        }
        MouseListener.mouseState.add(new MouseCoordinates(e.getKeyCode(), 0, 4));
    }

    public void nativeKeyReleased(NativeKeyEvent e) {
        System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
        MouseListener.mouseState.add(new MouseCoordinates(((int) NativeKeyEvent.getKeyText(e.getKeyCode()).charAt(0)), 0, 4));
        System.out.println((int) NativeKeyEvent.getKeyText(e.getKeyCode()).charAt(0));
    }

    public void nativeKeyTyped(NativeKeyEvent e) {
    }
}
