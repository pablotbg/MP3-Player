package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class ContentPaneController {
    @FXML
    private TableView<?> contentTable;

    public void initialize() {
        System.out.println("Content area created");
    }
}
