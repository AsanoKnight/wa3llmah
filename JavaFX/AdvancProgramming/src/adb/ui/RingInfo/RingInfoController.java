package adb.ui.RingInfo;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class RingInfoController implements Initializable {

    @FXML
    private AnchorPane txtTeacherName;
    @FXML
    private ImageView imgBack;
    @FXML
    private JFXTextField txtStudentNumber;
    @FXML
    private JFXTextField txtHalaqaTime;
    @FXML
    private JFXTextField txtHalaqaName;
    @FXML
    private JFXButton btnGraph;
    @FXML
    private JFXButton btnStudent;
    @FXML
    private Pane panStudent;
    @FXML
    private JFXListView<?> listStudent;
    @FXML
    private Pane panGraph;
    @FXML
    private JFXListView<?> listGraph;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Back(MouseEvent event) {
    }

    @FXML
    private void Graph(ActionEvent event) {
    }

    @FXML
    private void Student(ActionEvent event) {
    }

}
