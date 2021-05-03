package fiszki.pl.Fiszki.repository;

import fiszki.pl.Fiszki.model.EnglishWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolishWordRepository extends JpaRepository<EnglishWord,Long> {
}
