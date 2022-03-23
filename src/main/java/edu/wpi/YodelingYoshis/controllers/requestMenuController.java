package edu.wpi.YodelingYoshis.controllers;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class requestMenuController {

  private Stage stage;
  private Scene scene;
  private Parent root;

  @FXML
  void request1(ActionEvent event) throws IOException {
    Parent root =
        FXMLLoader.load(getClass().getResource("templateFeature.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}
