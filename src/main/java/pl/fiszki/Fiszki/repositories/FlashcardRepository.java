package pl.fiszki.Fiszki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fiszki.Fiszki.models.Flashcard;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard,Long> {
}
