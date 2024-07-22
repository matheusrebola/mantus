package mantus.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Games(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String name,
		GameKind gameKind,
		String description,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		GameType gameType) {

}
