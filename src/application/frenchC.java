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

public class frenchC {
    Main m = new Main();
    private Desktop desktop = Desktop.getDesktop();
    final FileChooser fileChooser = new FileChooser();
    @FXML
    TextArea text = new TextArea();

    public frenchC() {
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
    public void u1Action() {
        this.text.setText(this.text.getText() + "ù");
    }

    @FXML
    public void u2Action() {
        this.text.setText(this.text.getText() + "û");
    }

    @FXML
    public void u3Action() {
        this.text.setText(this.text.getText() + "ü");
    }

    @FXML
    public void yAction() {
        this.text.setText(this.text.getText() + "ÿ");
    }

    @FXML
    public void euroAction() {
        this.text.setText(this.text.getText() + "€");
    }

    @FXML
    public void a1Action() {
        this.text.setText(this.text.getText() + "à");
    }

    @FXML
    public void a2Action() {
        this.text.setText(this.text.getText() + "â");
    }

    @FXML
    public void aeAction() {
        this.text.setText(this.text.getText() + "æ");
    }

    @FXML
    public void cAction() {
        this.text.setText(this.text.getText() + "ç");
    }

    @FXML
    public void e1Action() {
        this.text.setText(this.text.getText() + "é");
    }

    @FXML
    public void e2Action() {
        this.text.setText(this.text.getText() + "è");
    }

    @FXML
    public void e3Action() {
        this.text.setText(this.text.getText() + "ê");
    }

    @FXML
    public void e4Action() {
        this.text.setText(this.text.getText() + "ë");
    }

    @FXML
    public void i1Action() {
        this.text.setText(this.text.getText() + "ï");
    }

    @FXML
    public void i2Action() {
        this.text.setText(this.text.getText() + "î");
    }

    @FXML
    public void oAction() {
        this.text.setText(this.text.getText() + "ô");
    }

    @FXML
    public void oeAction() {
        this.text.setText(this.text.getText() + "œ");
    }
}
