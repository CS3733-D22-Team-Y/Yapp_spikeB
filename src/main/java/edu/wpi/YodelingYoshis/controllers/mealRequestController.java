package edu.wpi.YodelingYoshis.controllers;

import edu.wpi.YodelingYoshis.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class mealRequestController {
  @FXML
  void backToRequestMenu(ActionEvent event) throws IOException {
    App.getInstance().setSceneToRequestMenu(); //Returns to request menu
  }
}
