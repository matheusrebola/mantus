package mantus.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import mantus.entities.Games;

@Entity
public interface GamesRepository extends JpaRepository<Games, UUID> {

}
