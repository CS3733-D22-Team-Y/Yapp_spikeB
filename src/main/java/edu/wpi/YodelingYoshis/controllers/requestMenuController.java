package edu.wpi.YodelingYoshis.controllers;

import edu.wpi.YodelingYoshis.App;
import java.awt.*;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class requestMenuController {

  // All below methods call corresponding scene setting methods in an instance of app
  // These are called by the corresponding button in the Request Menu (requestmenu.fxml)
  @FXML
  void securityServices(ActionEvent event) throws IOException {
    App.getInstance().setSceneToSecurityServicesRequest();
  }

  @FXML
  void medicalEquipment(ActionEvent event) throws IOException {
    App.getInstance().setSceneToMedicalEquipmentRequest();
  }

  @FXML
  void floralDelivery(ActionEvent event) throws IOException {
    App.getInstance().setSceneToFloralRequest();
  }

  @FXML
  void laundryServices(ActionEvent event) throws IOException {
    App.getInstance().setSceneToLaundryRequest();
  }

  @FXML
  void mealDelivery(ActionEvent event) throws IOException {
    App.getInstance().setSceneToMealRequest();
  }

  @FXML
  void religousRequests(ActionEvent event) throws IOException {
    App.getInstance().setSceneToSecurityServicesRequest();
  }

  @FXML
  void patientTransport(ActionEvent event) throws IOException {
    App.getInstance().setSceneToSecurityServicesRequest();
  }

  @FXML
  void maintenanceRequests(ActionEvent event) throws IOException {
    App.getInstance().setSceneToSecurityServicesRequest();
  }
}
