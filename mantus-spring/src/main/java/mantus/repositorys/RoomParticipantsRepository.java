package mantus.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mantus.entities.RoomParticipants;

@Repository
public interface RoomParticipantsRepository extends JpaRepository<RoomParticipants, UUID> {

}
