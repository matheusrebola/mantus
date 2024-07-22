package mantus.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import mantus.entities.Rankings;

@Entity
public interface RankingsRepository extends JpaRepository<Rankings, UUID> {

}
