package edu.wpi.YodelingYoshis;

import java.io.IOException;
import java.util.Objects;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App extends Application {
  private Stage primaryStage;
  private Scene securityServicesRequest;
  private Scene requestMenu;

  public void setSceneToRequestMenu() {
    primaryStage.setScene(requestMenu);
  }

  public void setSceneToSecurityServicesRequest() {
    primaryStage.setScene(securityServicesRequest);
  }

  private static App instance;

  public static App getInstance() {
    return instance;
  }

  @Override
  public void init() {
    log.info("Starting Up");
  }

  @Override

  public void start(Stage primaryStage) throws IOException {
    instance = this;
    this.primaryStage = primaryStage;
    Parent root =
        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("views/requestMenu.fxml")));
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();

    requestMenu =
        new Scene(
            FXMLLoader.load(
                Objects.requireNonNull(App.class.getResource("views/requestMenu.fxml"))));
    securityServicesRequest =
        new Scene(
            FXMLLoader.load(
                Objects.requireNonNull(
                    App.class.getResource("views/securityServicesRequest.fxml"))));

  }

  @Override
  public void stop() {
    log.info("Shutting Down");
  }
}
