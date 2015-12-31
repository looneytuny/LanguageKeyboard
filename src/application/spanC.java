package application;

import application.Controller;
import application.Main;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class spanC {
    Main m = new Main();
    private Desktop desktop = Desktop.getDesktop();
    final FileChooser fileChooser = new FileChooser();
    @FXML
    TextArea text = new TextArea();

    public spanC() {
    }

    @FXML
    private void openAction() {
        File file = this.fileChooser.showOpenDialog(this.m.primaryStage);
        if(file != null) {
            this.openFile(file);
        }

    }

    private void openFile(File file) {
        try {
            this.desktop.open(file);
        } catch (IOException var3) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, (String)null, var3);
        }

    }

    @FXML
    private void saveAsAction() {
        ExtensionFilter extFilter = new ExtensionFilter("TXT files (*.txt)", new String[]{"*.txt"});
        this.fileChooser.getExtensionFilters().add(extFilter);
        File file = this.fileChooser.showSaveDialog(this.m.primaryStage);
        if(file != null) {
            this.SaveFile(this.text.getText(), file);
        }

    }

    private void SaveFile(String content, File file) {
        try {
            FileWriter ex = null;
            ex = new FileWriter(file);
            ex.write(content);
            ex.close();
        } catch (IOException var4) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, (String)null, var4);
        }

    }

    @FXML
    private void exitAction() {
        System.exit(0);
    }

    @FXML
    public void qAction() {
        this.text.setText(this.text.getText() + "¿");
    }

    @FXML
    public void euroAction() {
        this.text.setText(this.text.getText() + "€");
    }

    @FXML
    public void aAction() {
        this.text.setText(this.text.getText() + "á");
    }

    @FXML
    public void eAction() {
        this.text.setText(this.text.getText() + "é");
    }

    @FXML
    public void iAction() {
        this.text.setText(this.text.getText() + "í");
    }

    @FXML
    public void nAction() {
        this.text.setText(this.text.getText() + "ñ");
    }

    @FXML
    public void oAction() {
        this.text.setText(this.text.getText() + "ó");
    }

    @FXML
    public void u1Action() {
        this.text.setText(this.text.getText() + "ú");
    }

    @FXML
    public void u2Action() {
        this.text.setText(this.text.getText() + "ü");
    }

    @FXML
    public void exAction() {
        this.text.setText(this.text.getText() + "¡");
    }
}
