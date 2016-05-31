package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("ToDo Desktop");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show(); // this part causes the window to appear
    }


    public static void main(String[] args) {
        launch(args); //special javafx method
    }
}
