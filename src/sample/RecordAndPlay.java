package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class RecordAndPlay {
    public static boolean isRecording = false;
    @FXML private static TextField saveFileName = new TextField();
    @FXML private static TextField openFileName = new TextField();

    public static void recordMovement() {
        isRecording = true;
    }
    public static void stopMovement() {
        isRecording = false;
    }
    public static void saveFile() {
        try{
            FileOutputStream fos = new FileOutputStream(saveFileName.getText()+".txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(MouseListener.mouseState);
            MouseListener.mouseState = new ArrayList<>();
            oos.close();
            System.out.println("Done saving file");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void openFile() {
        try{
            FileInputStream fis = new FileInputStream(openFileName.getText()+"txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            MouseListener.mouseState = (List) ois.readObject();
            MouseListener.mouseState = new ArrayList<>();
            ois.close();
            System.out.println("Done opening file");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
