package it.pegaso2000.ApplicazioneManga.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.pegaso2000.ApplicazioneManga.model.Manga;

@Repository
public interface MangaRepo extends JpaRepository<Manga, Integer> {

}
