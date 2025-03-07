package jsp.playerbattlejavadst_back.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Position {
    private int x;
    private int y;
}