package sample;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.Parent;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Rullo!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    /*
    @Override
    public void start(Stage primaryStage) throws Exception {


        primaryStage.setTitle("NonoGram");

        Button button1 = new Button("Add X");
        Button button2 = new Button("Remove X");
        Button button3 = new Button("Quit");

        FlowPane flowpane = new FlowPane();

        Text txt = new Text ("Instructions: \n");
        txt.setFont(Font.font("Dialog", FontWeight.BOLD, 12));
        flowpane.getChildren().add(txt);
        flowpane.getChildren().add(button1);
        flowpane.getChildren().add(button2);
        flowpane.getChildren().add(button3);


        Scene scene = new Scene(flowpane, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();


    }*/
    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Button was clicked, do something...
        //outputTextArea.appendText("Button Action\n");
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
