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

  @Override
  public void init() {
    log.info("Starting Up");
  }

  @Override
  public void start(Stage primaryStage) {
    FXMLLoader loader = new FXMLLoader();
    try {
      Parent root =
          loader.load(
              Objects.requireNonNull(getClass().getResource("/views/request_template.fxml")));
      primaryStage.setScene(new Scene(root));
    } catch (IOException e) {
      e.printStackTrace();
    }
    primaryStage.show();
  }

  @Override
  public void stop() {
    log.info("Shutting Down");
  }
}
