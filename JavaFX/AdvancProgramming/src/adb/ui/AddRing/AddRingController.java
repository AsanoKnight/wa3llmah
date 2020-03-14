package adb.ui.AddRing;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

public class AddRingController implements Initializable {

    @FXML
    private JFXTextField txtRingName;
    @FXML
    private JFXTextField txtTeacherName;
    @FXML
    private JFXComboBox<?> MaxStudent;
    @FXML
    private JFXComboBox<?> CameTime;
    @FXML
    private JFXButton btnAdd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void MaxStudent(ActionEvent event) {
    }

    @FXML
    private void CameTime(ActionEvent event) {
    }

    @FXML
    private void Add(ActionEvent event) {
    }

    @FXML
    private void Close(MouseEvent event) {
    }

}
