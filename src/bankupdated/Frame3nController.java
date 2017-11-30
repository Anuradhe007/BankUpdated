/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankupdated;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Prabhath
 */
public class Frame3nController {
    @FXML
    private Label fr3Msg;
    @FXML
    private JFXButton okBtn;
    public void initialize() {
       ReadTextFile readFile = new ReadTextFile();
        String account = readFile.getCustomerChosenAccount();
        if("Danske Gave Plus".equals(account)) {
            fr3Msg.setText("Further task steps have been sent to Danske Forvaltning via Danske Bank’s BPM.");
        }
        if("Danske Gave".equals(account)) {
            fr3Msg.setText("Proceed with account setup.");
        }
    }  
    
    @FXML
    public void okBtnClick() {
        try{
             Stage stage1 = (Stage) okBtn.getScene().getWindow();
             stage1.hide();             
          } catch(Exception e) {
              e.printStackTrace();
          }
    }
}
