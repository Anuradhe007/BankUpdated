/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankupdated;

import com.jfoenix.controls.JFXButton;
import java.io.File;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Prabhath
 */
public class Frame3Controller {

    @FXML
    private Label selectedAccount;
    @FXML
    private JFXButton sendBtn;
    @FXML
    private ImageView loadingImage;

    public void initialize() {

    }

    @FXML
    private void handleSendButtonAction(ActionEvent event) {
        try {

            Stage stage1 = (Stage) sendBtn.getScene().getWindow();
            stage1.hide();
            final FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Frame3b.fxml"));
            ReadTextFile readFile = new ReadTextFile();
            String account = readFile.getCustomerChosenAccount();
            String cust = readFile.getGiverInfo().get(1);
            fxmlLoader.getNamespace().put("customerName", cust);
            fxmlLoader.getNamespace().put("accountType", account);
            final Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setAlwaysOnTop(true);
            Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
            //set Stage boundaries to the lower right corner of the visible bounds of the main screen
            stage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - 487);
            stage.setY(0);
            stage.setTitle("Answer from Customer");
            stage.resizableProperty().setValue(Boolean.FALSE);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
