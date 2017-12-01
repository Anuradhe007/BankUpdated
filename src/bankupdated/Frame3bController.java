/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankupdated;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
public class Frame3bController implements Initializable {

    @FXML
    private JFXButton nAccount;
    @FXML
    private JFXButton pAccount;
    @FXML
    private Label origAccName;
    @FXML
    private JFXTextArea answerFrom;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ReadTextFile readTextFile = new ReadTextFile();
        origAccName.setText(readTextFile.getCustomerChosenAccount());
        answerFrom.setText(readTextFile.getCustomerMessage());
        answerFrom.editableProperty().set(false);
    }

    @FXML
    private void handleNormalButtonAction(ActionEvent event) {
        try {
            Stage stage1 = (Stage) nAccount.getScene().getWindow();
            stage1.hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handlePlusButtonAction(ActionEvent event) {
        try {

            Stage stage1 = (Stage) pAccount.getScene().getWindow();
            stage1.hide();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
