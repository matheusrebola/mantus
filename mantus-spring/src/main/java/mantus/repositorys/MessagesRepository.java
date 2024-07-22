package mantus.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import mantus.entities.Messages;

@Entity
public interface MessagesRepository extends JpaRepository<Messages, UUID> {

}
