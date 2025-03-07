package jsp.playerchessjavadst;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PlayerInterface {
    @FXML
    private Button moveButton;

    @FXML
    public void initialize() {
        moveButton.setOnAction(event -> System.out.println("Player Moved!"));
    }
}
