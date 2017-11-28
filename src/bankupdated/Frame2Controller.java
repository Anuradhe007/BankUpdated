/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankupdated;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 *
 * @author Prabhath
 */
public class Frame2Controller {
    @FXML
    private Label selectedAccount;
    @FXML
    private JFXButton suggestBtn;
    public void initialize() {
        ReadTextFile readFile = new ReadTextFile();
        String account = readFile.getCustomerChosenAccount();
        selectedAccount.setText(account);
        if("Danske Gave Plus".equals(account)) {
            suggestBtn.setVisible(false);
        }
        if("Danske Gave".equals(account)) {
            suggestBtn.setVisible(true);
        }
        
    }   
}
