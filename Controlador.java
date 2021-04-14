package holamundojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controlador {

    @FXML
    private Label label;

    public void initialize() {
        label.setText("Hola mundo desde JavaFX!!!");
    }
}
