package pl.fiszki.Fiszki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.fiszki.Fiszki.models.EnglishWord;
import pl.fiszki.Fiszki.models.Flashcard;

import java.util.List;

@Repository
public interface EnglishWordRepository extends JpaRepository<EnglishWord,Long> {

    @Query(value = "SELECT * FROM english_word WHERE name = ?1",nativeQuery = true)
    EnglishWord findAllByName(String name);
}
