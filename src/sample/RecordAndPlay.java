package sample;

public class RecordAndPlay {
    public static boolean isRecording = false;

    public static void recordMovement() {
        isRecording = true;
    }
    public static void stopMovement() {
        isRecording = false;
    }
}
