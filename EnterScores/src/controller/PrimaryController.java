/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author ITOmega
 */
public class PrimaryController implements Initializable{
    
    @FXML
    private AnchorPane anchorPane, anchorPane2;
    //select boxes for the league, home team and away team
    @FXML
    private ChoiceBox choiceLeague, choiceHomeTeam, choiceAwayTeam;
    //TextArea field
    @FXML
    private TextArea textArea;
    //Fields for goal entry at halftime and end of home and away team match
    @FXML
    private TextField halfTimeHomeScore, finalTimeHomeScore, halfTimeAwayScore, finalTimeAwayScore;
    
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        
    }
    
    /**
     * Informing the status of the matches selected and the results
     * and errors in TextField
     */
    private void writeTextArea(){
        try
        {
            //Fill in "textArea" with club names and results
            textArea.appendText("OK: " + choiceHomeTeam.getValue() + " - " + choiceAwayTeam.getValue() + " " 
                    + Integer.valueOf(finalTimeHomeScore.getText()) + ":"
                    + Integer.valueOf(finalTimeAwayScore.getText()) + "(" 
                    + Integer.valueOf(halfTimeHomeScore.getText()) + ":" 
                    + Integer.valueOf(halfTimeAwayScore.getText()) + ")\n");
            textArea.setWrapText(true);
            //the letters will be green
            textArea.setStyle("-fx-text-fill: #4F8A10;"); 
        }
        //Fill in "textArea" with erros
        catch(NumberFormatException e)
        {
            textArea.appendText("Error: " + e.getMessage() + "\n");
            textArea.setWrapText(true);
            //the letters will be red
            textArea.setStyle("-fx-text-fill: RED;"); 
        }    
    }
    
    /**
     * 
     * @param event
     * @throws IOException 
     * A button that changes the scene to a chosen league
     */
    @FXML
    private void nextButton(ActionEvent event) throws IOException
    {
        //The "Premier League" that loads the scene look from a file "englandView.fxml"
        if(choiceLeague.getValue().equals("England: Premier League"))
        {
            AnchorPane secondRoot = FXMLLoader.load(getClass().getResource("/view/englandView.fxml"));
            anchorPane.getChildren().setAll(secondRoot);
        }
        //The "Ligue1" that loads the scene look from a file "franceView.fxml"
        else if(choiceLeague.getValue().equals("France: Ligue 1"))
        {
            AnchorPane secondRoot = FXMLLoader.load(getClass().getResource("/view/franceView.fxml"));
            anchorPane.getChildren().setAll(secondRoot);
        }
        //The "Bundesliga" that loads the scene look from a file "germanyView.fxml"
        else if(choiceLeague.getValue().equals("Germany: Bundesliga"))
        {
            AnchorPane secondRoot = FXMLLoader.load(getClass().getResource("/view/germanyView.fxml"));
            anchorPane.getChildren().setAll(secondRoot);
        }
        //The "Seria A" that loads the scene look from a file "italyView.fxml"
        else if(choiceLeague.getValue().equals("Italy: Serie A"))
        {
            AnchorPane secondRoot = FXMLLoader.load(getClass().getResource("/view/italyView.fxml"));
            anchorPane.getChildren().setAll(secondRoot);
        }
        //The "La Liga" that loads the scene look from a file "spainView.fxml"
        else if(choiceLeague.getValue().equals("Spain: La Liga"))
        {
            AnchorPane secondRoot = FXMLLoader.load(getClass().getResource("/view/spainView.fxml"));
            anchorPane.getChildren().setAll(secondRoot);
        }
        //The "Super Liga" that loads the scene look from a file "serbiaView.fxml"
        else
        {
            AnchorPane secondRoot = FXMLLoader.load(getClass().getResource("/view/serbiaView.fxml"));
            anchorPane.getChildren().setAll(secondRoot);
        }
    }
    
    /**
     * 
     * @param event
     * @throws IOException 
     * A button that returns to the opening scene
     */
    @FXML
    private void backToPrimary(ActionEvent event) throws IOException
    {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/view_of_app.fxml"));
        anchorPane2.getChildren().setAll(root);
    }
    
    /**
     * 
     * @param event 
     * Executing a method that will pick up typed and selected data 
     * and forward it to textArea and to the server where it will be typed
     */
    @FXML
    private void executePremierLeague(ActionEvent event)
    {   
        //Printing data in textArea
        writeTextArea();
    }
    
    /**
     * 
     * @param event 
     * Executing a method that will pick up typed and selected data 
     * and forward it to textArea and to the server where it will be typed
     */
    @FXML
    private void executeLigue1(ActionEvent event)
    {
        //Printing data in textArea
        writeTextArea();
    }
    
    /**
     * 
     * @param event 
     * Executing a method that will pick up typed and selected data 
     * and forward it to textArea and to the server where it will be typed
     */
    @FXML
    private void executeBundesliga(ActionEvent event)
    {
        //Printing data in textArea
        writeTextArea();
    }
    
    /**
     * 
     * @param event 
     * Executing a method that will pick up typed and selected data 
     * and forward it to textArea and to the server where it will be typed
     */
    @FXML
    private void executeSerieA(ActionEvent event)
    {
        //Printing data in textArea
        writeTextArea();    
    }
    
    /**
     * 
     * @param event 
     * Executing a method that will pick up typed and selected data 
     * and forward it to textArea and to the server where it will be typed
     */
    @FXML
    private void executeLaLiga(ActionEvent event)
    {
        //Printing data in textArea
        writeTextArea();
    }
    
    /**
     * 
     * @param event 
     * Executing a method that will pick up typed and selected data 
     * and forward it to textArea and to the server where it will be typed
     */
    @FXML
    private void executeSuperLiga(ActionEvent event)
    {
        //Printing data in textArea
        writeTextArea();
    }
}