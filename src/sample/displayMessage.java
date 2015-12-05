package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class displayMessage
{

    public static void errorBox(String infoMessage, String titleBar)
    {
        errorBox(infoMessage, titleBar, null);
    }

    public static void errorBox(String infoMessage, String titleBar, String headerMessage)
    {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);
        alert.showAndWait();
    }
}