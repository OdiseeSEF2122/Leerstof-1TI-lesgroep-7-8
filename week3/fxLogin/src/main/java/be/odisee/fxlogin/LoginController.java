package be.odisee.fxlogin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    //Model
    //LoginRepository registeredAccounts; //we only use static methods so no need to instantiate.

    //View Binding
    @FXML
    private TextField txtUsername,txtPassword;
    @FXML
    private Label lblLoginMessage;

    //View actions
    @FXML
    protected void loginUser() {
        String username = txtUsername.getText();
        String passwd = txtPassword.getText();
        if(LoginRepository.isCorrectCreditentials(username,passwd)) {
            lblLoginMessage.setText("Login granted");
        } else {
            lblLoginMessage.setText("Incorrect login");
        }
    }
    /* Moet in de loginController *alle* logica van het inloggen?
    Neen, hoeft niet. Je kan business rules en vele beslissingen (welke soort foutboodschappen toon ik)
    in aparte classes steken, vb de faceBookLoginService, loginErrorHandlerService, ... .
    In de loginController blijft dan enkel de code welke de FXML-objecten opvraagt en instelt.
    Voordeel: je kan unit testen maken voor de aparte Service classes
     */
}