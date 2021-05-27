package pl.fiszki.Fiszki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.fiszki.Fiszki.models.Level;

public interface LevelRepository extends JpaRepository<Level,Long> {
}
