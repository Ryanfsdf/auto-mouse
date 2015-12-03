package sample;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyboardListener implements NativeKeyListener {

    public void nativeKeyPressed(NativeKeyEvent e) {
        String keyChecker =  NativeKeyEvent.getKeyText(e.getKeyCode());
        if (keyChecker == "NumPad Subtract" && RecordAndPlay.isRecording == false) {
            TheRobot.moveMouse();
        }
        System.out.println(keyChecker);
    }

    public void nativeKeyReleased(NativeKeyEvent e) {
        System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }

    public void nativeKeyTyped(NativeKeyEvent e) {
    }
}
