/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ebalc
 */
public class RegisterController implements Initializable
{

    @FXML
    private ImageView logoView;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private DatePicker dateOfBirthField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button submitButton;
    @FXML
    private Label feedbackLabel;

    public ImageView getLogoView()
    {
        return logoView;
    }

    public void setLogoView(ImageView logoView)
    {
        this.logoView = logoView;
    }

    public TextField getFirstNameField()
    {
        return firstNameField;
    }

    public void setFirstNameField(TextField firstNameField)
    {
        this.firstNameField = firstNameField;
    }

    public TextField getLastNameField()
    {
        return lastNameField;
    }

    public void setLastNameField(TextField lastNameField)
    {
        this.lastNameField = lastNameField;
    }

    public DatePicker getDateOfBirthField()
    {
        return dateOfBirthField;
    }

    public void setDateOfBirthField(DatePicker dateOfBirthField)
    {
        this.dateOfBirthField = dateOfBirthField;
    }

    public TextField getEmailField()
    {
        return emailField;
    }

    public void setEmailField(TextField emailField)
    {
        this.emailField = emailField;
    }

    public TextField getUsernameField()
    {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField)
    {
        this.usernameField = usernameField;
    }

    public PasswordField getPasswordField()
    {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField)
    {
        this.passwordField = passwordField;
    }

    public Button getLoginButton()
    {
        return loginButton;
    }

    public void setLoginButton(Button loginButton)
    {
        this.loginButton = loginButton;
    }

    public Button getSubmitButton()
    {
        return submitButton;
    }

    public void setSubmitButton(Button submitButton)
    {
        this.submitButton = submitButton;
    }

    public Label getFeedbackLabel()
    {
        return feedbackLabel;
    }

    public void setFeedbackLabel(Label feedbackLabel)
    {
        this.feedbackLabel = feedbackLabel;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        //Set logo image
        getLogoView().setImage(new Image("/Assets/20_IST311_GoLife_Logo_v1.png"));
    }    

    @FXML
    private void toLogin(ActionEvent event)
    {
        try
        {
            //Load FXML detail view
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/LoginView.fxml"));
            Parent loginView = loader.load();

            //Instantiate scene, give it the parent we instantiated, also get current scene from event source
            Scene loginScene = new Scene(loginView);
            Scene currentScene = ((Node)event.getSource()).getScene();

            //Instantiate new stage, give it the scene we instantiated, set visible
            Stage stage = (Stage) currentScene.getWindow();
            stage.setScene(loginScene);
            stage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void submitRegister(ActionEvent event)
    {
        System.out.println("Register!");
    }
}
