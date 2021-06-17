package pl.fiszki.Fiszki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.fiszki.Fiszki.models.Flashcard;

import java.util.List;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard,Long> {

    @Query(value = "SELECT * FROM flashcards WHERE topic_id = ?1",nativeQuery = true)
    List<Flashcard> findAllByTopicId(Long topicId);


}
