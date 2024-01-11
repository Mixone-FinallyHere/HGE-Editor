package org.mixone.hgeeditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(stage);
        File levelupdata = new File(
                selectedDirectory.getAbsolutePath()
                        +"\\armips\\data\\levelupdata.s");
        if(!levelupdata.isFile()){
            welcomeText.setText("Invalid directory");
        }else{
            welcomeText.setText(levelupdata.getAbsolutePath());
        }
    }
}