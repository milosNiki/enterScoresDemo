package enterscores;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author ITOmega
 */
public class EnterScores extends Application{
    
    /**
     * 
     * @param args 
     * the main method for running an application
     */
    public static void main(String[] args) {
        
        launch(args);
    }
    
    /**
     * 
     * @param stage
     * @throws Exception
     * method for starting and loading a stage
     */
    @Override
    public void start(Stage stage) throws Exception{
        
        //the path for loading the ".fxml" file of the opening scene
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/view_of_app.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Enter Scores by Omega Cycle");
        stage.getIcons().add(new Image("omegapng.png"));
        stage.setScene(scene);
        stage.show();
    }
}