package mantus.entities;

import jakarta.persistence.Entity;

@Entity
public record RoomParticipants(
		Users user,
		Rooms room) {

}
