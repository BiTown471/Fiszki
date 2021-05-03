package fiszki.pl.Fiszki.repository;

import fiszki.pl.Fiszki.model.FlashCards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashCardsRepository extends JpaRepository<FlashCards,Long> {
}
