package it.pegaso2000.ApplicazioneManga.service;

import java.util.List;

import it.pegaso2000.ApplicazioneManga.model.Manga;

public interface MangaService {

	List<Manga> findAll();
	Manga findById(int id);
	Manga save(Manga manga);
	boolean delete(int id);
}

