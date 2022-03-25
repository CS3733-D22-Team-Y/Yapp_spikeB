package edu.wpi.YodelingYoshis.controllers;

import edu.wpi.YodelingYoshis.App;
import java.awt.*;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class requestMenuController {

  @FXML
  void securityServices(ActionEvent event) throws IOException {
    App.getInstance().setSceneToSecurityServicesRequest();
  }

  @FXML
  void medicalEquipment(ActionEvent event) throws IOException {
    App.getInstance().setSceneToSecurityServicesRequest();
  }

  @FXML
  void floralDelivery(ActionEvent event) throws IOException {
    App.getInstance().setSceneToSecurityServicesRequest();
  }

  @FXML
  void laundryServices(ActionEvent event) throws IOException {
    App.getInstance().setSceneToSecurityServicesRequest();
  }

  @FXML
  void languageInterpreters(ActionEvent event) throws IOException {
    App.getInstance().setSceneToSecurityServicesRequest();
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
