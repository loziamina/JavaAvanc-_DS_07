package jsp.playerbattlejavadst_back.repository;
import jsp.playerbattlejavadst_back.model.Player;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}