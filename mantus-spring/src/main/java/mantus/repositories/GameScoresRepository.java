package mantus.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mantus.entities.GameScores;

@Repository
public interface GameScoresRepository extends JpaRepository<GameScores, UUID> {

}
