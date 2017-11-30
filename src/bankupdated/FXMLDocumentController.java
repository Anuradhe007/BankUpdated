/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankupdated;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Prabhath
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label customerReq;
    @FXML
    private Button button;
    @FXML
    private JFXButton jfxButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try{
           
             Stage stage1 = (Stage) jfxButton.getScene().getWindow();
             stage1.hide();
             
        ReadTextFile readFile = new ReadTextFile();
             final FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Frame2.fxml"));

        fxmlLoader.getNamespace().put("labelText1", readFile.getRecieverInfo().get(0));
        fxmlLoader.getNamespace().put("labelText2", readFile.getRecieverInfo().get(1));
        
        fxmlLoader.getNamespace().put("labelText3", readFile.getParent1Info().get(0));
        fxmlLoader.getNamespace().put("labelText4", readFile.getParent1Info().get(1));
        fxmlLoader.getNamespace().put("labelText5", readFile.getParent1Info().get(2));
        
        fxmlLoader.getNamespace().put("labelText6", readFile.getParent2Info().get(0));
        fxmlLoader.getNamespace().put("labelText7", readFile.getParent2Info().get(1));
        fxmlLoader.getNamespace().put("labelText8", readFile.getParent2Info().get(2));
        
        fxmlLoader.getNamespace().put("labelText9", readFile.getGiverInfo().get(0));
        fxmlLoader.getNamespace().put("labelText10", readFile.getGiverInfo().get(1));
        fxmlLoader.getNamespace().put("labelText11", readFile.getGiverInfo().get(2));
        
        final Parent root = fxmlLoader.load();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setAlwaysOnTop(true);
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        //set Stage boundaries to the lower right corner of the visible bounds of the main screen
        stage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - 487);
        stage.setY(0);
        stage.setTitle("Retrieve Customer");
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.show();
          } catch(Exception e) {
              e.printStackTrace();
          }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ReadTextFile readTextFile = new ReadTextFile();
        customerReq.setText("Customer requests "+readTextFile.getCustomerChosenAccount());
    }    
    
}
