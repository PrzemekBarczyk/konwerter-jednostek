package main.mainmenu;

import main.utilities.Constants;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

class MainMenuView {

    private Scene scene;
    private Button lengthButton;
    private Button massButton;

    MainMenuView() {
        this.createGUI();
    }

    private void createGUI() {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(25);
        pane.setVgap(25);
        pane.setPadding(new Insets(30, 30, 30, 30));

        Text menuNameText = new Text("Choose converter");
        menuNameText.setFont(new Font("Default", 25));
        GridPane.setHalignment(menuNameText, HPos.CENTER);
        pane.add(menuNameText, 0, 0, 2, 1);

        lengthButton = new Button("Length");
        GridPane.setHalignment(lengthButton, HPos.CENTER);
        pane.add(lengthButton, 0, 1);

        massButton = new Button("Mass");
        GridPane.setHalignment(massButton, HPos.CENTER);
        pane.add(massButton, 1,1);

        scene = new Scene(pane, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
    }

    void addEventHandlers(EventHandler<ActionEvent> actionEventHandler) {

        lengthButton.setOnAction(actionEventHandler);
        massButton.setOnAction(actionEventHandler);
    }

    Scene getScene() {
        return scene;
    }

    Button getLengthButton() {
        return lengthButton;
    }

    Button getMassButton() {
        return massButton;
    }
}
