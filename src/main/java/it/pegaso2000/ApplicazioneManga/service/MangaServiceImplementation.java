package it.pegaso2000.ApplicazioneManga.service;

import java.util.List;
import java.util.Optional;

import it.pegaso2000.ApplicazioneManga.model.Manga;
import it.pegaso2000.ApplicazioneManga.repo.MangaRepo;

public class MangaServiceImplementation  implements MangaService{

	private MangaRepo mRepo;
	
	public MangaServiceImplementation( MangaRepo mRepo ) {
		this.mRepo = mRepo;
	}
	
	@Override
	public boolean delete(int id) {
		Optional<Manga> m = mRepo.findById(id);
		if(m.isPresent()) {
			mRepo.deleteById(id);
			return true;
		}
		return false;
	}
	@Override
	public List<Manga> findAll() {
		return mRepo.findAll();
	}
	@Override
	public Manga findById(int id) {
		Optional<Manga> m = mRepo.findById(id);
		if (m.isPresent()) return m.get();
		return null;
	}
	@Override
	public Manga save(Manga manga) {
		return mRepo.save(manga);
	}
	
}
