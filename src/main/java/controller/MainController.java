package controller;

import javafx.fxml.FXML;

public class MainController {
    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    @FXML
    private MenuPaneController menuPaneController;

    public void initialize() {
        System.out.println("Main controller created");
    }
}
