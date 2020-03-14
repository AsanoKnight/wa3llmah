package adp.ui.ring;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class RingsController implements Initializable {

    @FXML
    private JFXButton btnHalaqa;
    @FXML
    private JFXButton btnAddRing;
    @FXML
    private ImageView imgAddRing;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void AddRing(ActionEvent event) {
    }

    @FXML
    private void AddRing(MouseEvent event) {
    }

}
