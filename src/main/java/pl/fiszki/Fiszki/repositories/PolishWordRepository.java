package pl.fiszki.Fiszki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.fiszki.Fiszki.models.EnglishWord;
import pl.fiszki.Fiszki.models.PolishWord;

@Repository
public interface PolishWordRepository extends JpaRepository<PolishWord,Long> {

    @Query(value = "SELECT * FROM polish_word WHERE name = ?1",nativeQuery = true)
    PolishWord findAllByName(String name);
}
