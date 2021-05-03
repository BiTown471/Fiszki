package pl.fiszki.Fiszki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fiszki.Fiszki.models.EnglishWord;

@Repository
public interface EnglishWordRepository extends JpaRepository<EnglishWord,Long> {
}
