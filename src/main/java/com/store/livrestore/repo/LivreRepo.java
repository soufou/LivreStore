package com.store.livrestore.repo;

import com.store.livrestore.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LivreRepo extends JpaRepository<Livre,Long> {
    void deleteLivreById(Long id);

    Optional<Livre> findLivreById(Long id);
}
