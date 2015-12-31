package application;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    public Stage primaryStage;
    Circle ball2;

    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("viet.fxml"));
        Parent gLand = (Parent)FXMLLoader.load(this.getClass().getResource("German.fxml"));
        Parent fLand = (Parent)FXMLLoader.load(this.getClass().getResource("French.fxml"));
        Parent sLand = (Parent)FXMLLoader.load(this.getClass().getResource("Spanish.fxml"));
        AnchorPane menu = new AnchorPane();
        Rectangle b = new Rectangle(720,550) {
            {
                this.setFill(Color.GREEN);
            }
        };
        Label display = new Label("Please select your language");
        display.setTranslateX(200);
        display.setTranslateY(200);
        display.setFont(new Font("Arial", 25));
        Button viet = new Button("Vietnamese");
        viet.setTranslateX(290);
        viet.setTranslateY(270);
        Button german = new Button("German");
        german.setTranslateX(390);
        german.setTranslateY(270);
        Button french = new Button("French");
        french.setTranslateX(222);
        french.setTranslateY(270);
        Button spanish = new Button("Spanish");
        spanish.setTranslateX(300);
        spanish.setTranslateY(310);
        this.ball2 = new Circle(75) {
            {
                this.setFill(Color.BLUE);
                this.setTranslateX(360);
                this.setTranslateY(100);
            }
        };
        FadeTransition ft2 = new FadeTransition(Duration.millis(2500), this.ball2);
        ft2.setFromValue(1.0);
        ft2.setToValue(0.3);
        ft2.setCycleCount(-1);
        ft2.setAutoReverse(true);
        ft2.play();
        menu.getChildren().addAll(b,viet, german, display, this.ball2, french, spanish);
        primaryStage.setTitle("Language Text");
        primaryStage.setScene(new Scene(menu, 720, 550));
        viet.setOnAction((e) -> {
            primaryStage.setScene(new Scene(root, 720, 550));
        });
        german.setOnAction((e) -> {
            primaryStage.setScene(new Scene(gLand, 720, 550));
        });
        french.setOnAction((e) -> {
            primaryStage.setScene(new Scene(fLand, 720, 550));
        });
        spanish.setOnAction((e) -> {
            primaryStage.setScene(new Scene(sLand, 720, 550));
        });
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

