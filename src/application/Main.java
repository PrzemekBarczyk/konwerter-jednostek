package application;

import application.mainmenu.MainMenuController;
import application.mainmenu.MainMenuModel;
import application.mainmenu.MainMenuView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        primaryStage = stage;
        primaryStage.setTitle("Unit Converter");
        primaryStage.setScene(new MainMenuController(new MainMenuView(), new MainMenuModel()).getScene());
        primaryStage.show();
    }

    public static void setScene(Scene newScene) {
        primaryStage.setScene(newScene);
    }
}
