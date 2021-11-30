/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package oopfinalkelompokb;

import javafx.application.Application;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);

        double margin = 12f;
        double unit = (scene.getHeight() - (2 * margin)) * 0.25f;

        int i, j;

        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                Rectangle rec = new Rectangle((j * unit) + margin, (i * unit) + margin, unit, unit);
                rec.setFill(Color.WHEAT);
                rec.setStroke(Color.GRAY);
                root.getChildren().add(rec);
            }
        }

        stage.setScene(scene);
        stage.show();
    }
    
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        launch();
    }
}
