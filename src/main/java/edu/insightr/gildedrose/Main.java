package edu.insightr.gildedrose;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        try {
            // TODO (PBZ) : using pixel size into your fxml is not a good idea (no responsive, no decoration isolation)
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Inventory.fxml"));
            primaryStage.setTitle("Main Window");
            primaryStage.setScene(new Scene(root, 650, 500));
            primaryStage.show();
        }
        catch(Exception e) {
        e.printStackTrace();
    }
    }
}
