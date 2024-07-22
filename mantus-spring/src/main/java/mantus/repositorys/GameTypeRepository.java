package mantus.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mantus.entities.GameType;

@Repository
public interface GameTypeRepository extends JpaRepository<GameType, UUID> {

}
