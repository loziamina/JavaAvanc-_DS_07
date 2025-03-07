package jsp.playerbattlejavadst_back.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private int xp;
    private int health;
    private int attackPower;

    @Embedded
    private Position position;
}