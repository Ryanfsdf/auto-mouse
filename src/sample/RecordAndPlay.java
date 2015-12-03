package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class RecordAndPlay {

    public static boolean isRecording = false;

    public static void recordMovement() {
        isRecording = true;
    }
    public static void stopMovement() {
        isRecording = false;
    }
    public static void saveFile() {
        try{
            FileOutputStream fos = new FileOutputStream("MacroSave__"/*+saveFileName.getText()*/+"__.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(MouseListener.savedMouseState);
            oos.close();
            System.out.println("Done saving file");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void openFile() {
        try{
            FileInputStream fis = new FileInputStream("MacroSave__"/*+openFileName.getText()*/+"__.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            MouseListener.savedMouseState = (List<MouseCoordinates>) ois.readObject();
            ois.close();
            System.out.println("Done opening file");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
