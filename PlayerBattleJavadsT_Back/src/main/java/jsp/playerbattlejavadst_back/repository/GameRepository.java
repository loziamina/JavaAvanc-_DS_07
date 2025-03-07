package jsp.playerbattlejavadst_back.repository;


import jsp.playerbattlejavadst_back.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}