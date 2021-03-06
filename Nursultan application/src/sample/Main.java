package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        primaryStage.show();
        primaryStage.setScene(new Scene(root, 779, 490));
        primaryStage.show();
        primaryStage.setTitle("Nursultan Image Viewer");
    }

    public static void main(String[] args) {
        launch(args);
    }
}