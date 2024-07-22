package mantus.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mantus.entities.Rooms;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, UUID> {

}
