package jsp.playerchessjavadst;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class AnimationsUI {

    @FXML
    private Button animateButton;

    @FXML
    private ImageView animatedIcon;

    @FXML
    public void initialize() {
        animateButton.setOnAction(event -> playAnimations());
    }

    private void playAnimations() {
        // Animation de Translation
        TranslateTransition translate = new TranslateTransition(Duration.seconds(1), animatedIcon);
        translate.setByX(100);
        translate.setAutoReverse(true);
        translate.setCycleCount(2);

        // Animation de Rotation
        RotateTransition rotate = new RotateTransition(Duration.seconds(1), animatedIcon);
        rotate.setByAngle(360);
        rotate.setCycleCount(1);

        // Animation de Zoom
        ScaleTransition scale = new ScaleTransition(Duration.seconds(1), animatedIcon);
        scale.setToX(1.5);
        scale.setToY(1.5);
        scale.setAutoReverse(true);
        scale.setCycleCount(2);

        // Animation de Fondu
        FadeTransition fade = new FadeTransition(Duration.seconds(1), animatedIcon);
        fade.setFromValue(1.0);
        fade.setToValue(0.3);
        fade.setAutoReverse(true);
        fade.setCycleCount(2);

        // Lancer les animations
        translate.play();
        rotate.play();
        scale.play();
        fade.play();
    }
}
