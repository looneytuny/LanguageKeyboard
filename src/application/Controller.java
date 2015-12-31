package application;

import application.Main;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class Controller {
    Main m = new Main();
    private Desktop desktop = Desktop.getDesktop();
    final FileChooser fileChooser = new FileChooser();
    @FXML
    TextArea text = new TextArea();

    public Controller() {
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
    public void a1Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "á");
    }

    @FXML
    public void a2Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "à");
    }

    @FXML
    public void a3Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "ả");
    }

    @FXML
    public void a4Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "ã");
    }

    @FXML
    public void a5Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "ạ");
    }

    @FXML
    public void a6Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "â");
    }

    @FXML
    public void a7Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "ă");
    }

    @FXML
    public void o1Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "ô");
    }

    @FXML
    public void o2Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "ơ");
    }

    @FXML
    public void uAction(ActionEvent e) {
        this.text.setText(this.text.getText() + "ư");
    }

    @FXML
    public void e1Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "ê");
    }

    @FXML
    public void e2Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "ế");
    }

    @FXML
    public void e3Action(ActionEvent e) {
        this.text.setText(this.text.getText() + "ề");
    }
}

