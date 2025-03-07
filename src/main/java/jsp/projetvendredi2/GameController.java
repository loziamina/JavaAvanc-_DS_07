package jsp.projetvendredi2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {
    @GetMapping("/state")
    public String getGameState() {
        return "Game State Loaded";
    }
}