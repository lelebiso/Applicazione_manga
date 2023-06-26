package it.pegaso2000.ApplicazioneManga.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.pegaso2000.ApplicazioneManga.dto.MangaDto;
import it.pegaso2000.ApplicazioneManga.model.Manga;
import it.pegaso2000.ApplicazioneManga.service.MangaService;

@Controller
public class MangaController {

	private MangaService service;

	@Autowired
	public MangaController(MangaService service) {
		this.service = service;
	}

	@GetMapping("")
	public String goToHome() {
		return "redirect:/home";
	}
	
	@PostMapping("/save")
	public String saveManga(@ModelAttribute ("nuovo") Manga manga) {
		service.save(manga);
		return "redirect:/home";
	}
	
	@GetMapping("/NuovoFormManga")
	public String goToManga(Model model) {
		Manga manga = new Manga();
		model.addAttribute("nuovo", manga);
		return "new_manga";
	}
	
	@GetMapping("/home")
	public String list( Model model ) {
		List<Manga> list = service.findAll();
		List<MangaDto> result = new ArrayList<>();
		for (Manga manga : list) {
			result.add(entityToDto(manga));
		}
		model.addAttribute("lista", result);
		return "homepageManga";
	}
	
	private MangaDto entityToDto(Manga m) {
		MangaDto dto = new MangaDto();
		dto.setId(m.getId());
		dto.setTitolo(m.getTitolo());
		dto.setAutore(m.getAutore());
		dto.setGenere(m.getGenere());
		dto.setNumeroVolumi(m.getNumeroVolumi());
		dto.setAnno(m.getAnno());
		dto.setCasaEditrice(m.getCasaEditrice());
		dto.setCategoria(m.getCategoria());
		dto.setDisponibilita(m.getDisponibilita());
		dto.setNumeroCapitoli(m.getNumeroVolumi());
		dto.setSegnaLibro(m.getSegnaLibro());
		dto.setSrcImg(m.getSrcImg());
		dto.setStato(m.getStato());
		dto.setStatoOperaItalia(m.getStatoOperaItalia());
		dto.setTags(m.getTags());
		dto.setTrama(m.getTrama());
		dto.setValutazione(m.getValutazione());
		return dto;
	}
}
