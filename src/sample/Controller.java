package sample;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML Button pressRecord = new Button();
    @FXML Button pressStop = new Button();
    @FXML Button pressPlay = new Button();
    @FXML TextField saveFileName = new TextField();
    @FXML TextField openFileName = new TextField();


    public void startRecord(ActionEvent actionEvent) {
        RecordAndPlay.recordMovement();
        pressRecord.setVisible(false);
        pressStop.setVisible(true);
        pressPlay.setVisible(false);
        MouseListener.savedMouseState = new ArrayList<>();
    }
    public void startStop(ActionEvent actionEvent) {
        RecordAndPlay.stopMovement();
        pressRecord.setVisible(true);
        pressStop.setVisible(false);
        pressPlay.setVisible(true);
        for(int x = 0; x < MouseListener.mouseState.size()-1; x++) {
            MouseListener.savedMouseState.add(x,MouseListener.mouseState.get(x+1));
        }
        MouseListener.mouseState = new ArrayList<>();
    }
    public void startPlay(ActionEvent actionEvent) {
        TheRobot.moveMouse();
    }

    public void startSave(ActionEvent actionEvent) {
        try{
            FileOutputStream fos = new FileOutputStream("MacroSave__"+saveFileName.getText()+"__.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(MouseListener.savedMouseState);
            oos.close();
            System.out.println("Done saving file");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void startOpen(ActionEvent actionEvent) {
        File checkOpen = new File("MacroSave__"+openFileName.getText()+"__.txt");
        if(checkOpen.exists()) {
            try{
                FileInputStream fis = new FileInputStream("MacroSave__"+openFileName.getText()+"__.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                MouseListener.savedMouseState = (List<MouseCoordinates>) ois.readObject();
                ois.close();
                System.out.println("Done opening file");
            }catch(Exception ex){
                ex.printStackTrace();
            }
            pressRecord.setVisible(true);
            pressStop.setVisible(false);
            pressPlay.setVisible(true);
        }
    }
}
