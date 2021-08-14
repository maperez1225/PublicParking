package vistaControl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ParqueoPublico extends Application {

      @Override
      public void start(Stage stage) throws Exception{
         Parent root =
            FXMLLoader.load(getClass().getResource("ParqueoPublico.fxml"));

         Scene scene = new Scene(root); // attach scene graph to scene
         // To add a line
         stage.setScene(scene); // attach scene to stage
         stage.setTitle("Parqueo P�blico"); // add title to stage
         stage.show(); // display the stage
      }

      public static void main(String[] args) {
         launch(args);
      }
}
