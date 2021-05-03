package pl.fiszki.Fiszki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fiszki.Fiszki.models.Topic;
@Repository
public interface TopicRepository extends JpaRepository<Topic,Long> {
}
