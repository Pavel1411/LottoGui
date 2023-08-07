package com.example.lottogui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private CheckBox blueBox;

    @FXML
    private GridPane blueFirstGrid;

    @FXML
    private GridPane blueSecondGrid;

    @FXML
    private GridPane blueThirdGrid;

    @FXML
    private Button exit;

    @FXML
    private Button found;

    @FXML
    private CheckBox greenBox;

    @FXML
    private GridPane greenFirstGrid;

    @FXML
    private GridPane greenSecondGrid;

    @FXML
    private GridPane greenThirdGrid;

    @FXML
    private Label numberOfBarrel;

    @FXML
    private Button pause;

    @FXML
    private Button roll;

    @FXML
    private Button settings;

    @FXML
    private CheckBox violetBox;

    @FXML
    private GridPane violetFirstGrid;

    @FXML
    private GridPane violetSecondGrid;

    @FXML
    private GridPane violetThirdGrid;

    @FXML
    private CheckBox yellowBox;

    @FXML
    private GridPane yellowFirstGrid;

    @FXML
    private GridPane yellowSecondGrid;

    @FXML
    private GridPane yellowThirdGrid;


    @FXML
    void initialize(){ // Test
        roll.setOnAction(actionEvent -> {
            System.out.println("It rolls");
        });
    }
}