package jsp.playerchessjavadst;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GameBoard {
    @FXML
    private Button startButton;

    @FXML
    public void initialize() {
        startButton.setOnAction(event -> System.out.println("Game Started!"));
    }
}
