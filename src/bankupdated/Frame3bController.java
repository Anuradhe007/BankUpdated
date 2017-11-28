/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankupdated;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Prabhath
 */
public class Frame3bController {
    @FXML
    private JFXButton nAccount;
    @FXML
    private JFXButton pAccount;
    public void initialize() {
      
    }   
    
    @FXML
    private void handleNormalButtonAction(ActionEvent event) {
        try{
           
             Stage stage1 = (Stage) nAccount.getScene().getWindow();
             stage1.hide();
             
             
          } catch(Exception e) {
              e.printStackTrace();
          }
    }
    
    @FXML
    private void handlePlusButtonAction(ActionEvent event) {
        try{
           
             Stage stage1 = (Stage) pAccount.getScene().getWindow();
             stage1.hide();
             
             
          } catch(Exception e) {
              e.printStackTrace();
          }
    }
}
