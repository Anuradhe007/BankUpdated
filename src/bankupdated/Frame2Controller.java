/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankupdated;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Prabhath
 */
public class Frame2Controller {

    @FXML
    private JFXButton continueBtn;
    @FXML
    private JFXButton viewP1BankDet;
    @FXML
    private JFXButton viewP2BankDet;
    @FXML
    private JFXButton viewGiverBankDet;
    @FXML
    private Label selectedAccount;
    @FXML
    private Label giverSignature;
    @FXML
    private Label giverSignatureVal;
    @FXML
    private Label p1Signature;
    @FXML
    private Label p1SignatureVal;
    @FXML
    private JFXButton suggestBtn;

    public void initialize() {
        ReadTextFile readFile = new ReadTextFile();
        String account = readFile.getCustomerChosenAccount();
        giverSignature.setText(readFile.getGiverInfo().get(1) + " electronic signature: ");
        giverSignatureVal.setText(readFile.getGiverInfo().get(3));
        p1Signature.setText(readFile.getParent1Info().get(1) + " electronic signature: ");
        p1SignatureVal.setText(readFile.getParent1Info().get(3));
        selectedAccount.setText(account);
        if ("Danske Gave Plus".equals(account)) {
            suggestBtn.setVisible(false);
        }
        if ("Danske Gave".equals(account)) {
            suggestBtn.setVisible(true);
        }

    }

    @FXML
    private void handleSuggestButtonAction(ActionEvent event) {
        try {

            Stage stage1 = (Stage) suggestBtn.getScene().getWindow();
            stage1.hide();

            final FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Frame3.fxml"));

            fxmlLoader.getNamespace().put("message", "Message to customer.");

            final Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setAlwaysOnTop(true);
            Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
            //set Stage boundaries to the lower right corner of the visible bounds of the main screen
            stage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - 487);
            stage.setY(0);
            stage.setTitle("Message to Customer");
            stage.resizableProperty().setValue(Boolean.FALSE);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleContinueButtonAction(ActionEvent event) {
        try {

            Stage stage1 = (Stage) continueBtn.getScene().getWindow();
            stage1.hide();

            final FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Frame3_n.fxml"));

            final Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setAlwaysOnTop(true);
            Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
            //set Stage boundaries to the lower right corner of the visible bounds of the main screen
            stage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - 487);
            stage.setY(0);
            stage.resizableProperty().setValue(Boolean.FALSE);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewP1BankDet() {
        try {
            Desktop.getDesktop().open(new File(Paths.get("bank_details\\Parent1BankingDetails.xlsx").toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewP2BankDet() {
        try {
            Desktop.getDesktop().open(new File(Paths.get("bank_details\\Parent2BankingDetails.xlsx").toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewGiverBankDet() {
        try {
            Desktop.getDesktop().open(new File(Paths.get("bank_details\\GiverBankingDetails.xlsx").toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
