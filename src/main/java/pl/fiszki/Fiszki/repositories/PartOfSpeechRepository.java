package pl.fiszki.Fiszki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fiszki.Fiszki.models.PartOfSpeech;

import java.util.Optional;

@Repository
public interface PartOfSpeechRepository extends JpaRepository<PartOfSpeech,Long> {


}
