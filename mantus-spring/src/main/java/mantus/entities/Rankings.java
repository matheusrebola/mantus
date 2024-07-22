package mantus.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Rankings(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Integer score,
		Integer rank,
		LocalDateTime updatedAt,
		Users user,
		Games game) {

}
