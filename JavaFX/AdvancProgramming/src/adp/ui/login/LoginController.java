package adp.ui.login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable {

    @FXML
    private Label lblForget;
    @FXML
    private JFXButton btnLogin;
    @FXML
    private JFXTextField txtUserName;
    @FXML
    private JFXPasswordField txtPassWord;
    @FXML
    private ImageView imgLogo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Forget(MouseEvent event) {
    }

    @FXML
    private void Login(ActionEvent event) {
    }

}
