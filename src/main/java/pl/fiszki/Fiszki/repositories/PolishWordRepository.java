package pl.fiszki.Fiszki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fiszki.Fiszki.models.PolishWord;

@Repository
public interface PolishWordRepository extends JpaRepository<PolishWord,Long> {
}
