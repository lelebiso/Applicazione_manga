package it.pegaso2000.ApplicazioneManga.dto;

public class MangaDto {
	private int id;
	private String titolo;
	private String autore;
	private String genere;
	private String casaEditrice;
	private String categoria;
	private String tags;
	private String stato;
	private String srcImg;
	private String trama;
	private String disponibilita;
	private String statoOperaItalia;
	private String segnaLibro;
	private int valutazione;
	private int numeroCapitoli;
	private int numeroVolumi;
	private int anno;

	public MangaDto() {
	}

	public MangaDto(int id, String titolo, String autore, String genere, String casaEditrice, String categoria,
			String tags, String stato, String srcImg, String trama, String disponibilita, String statoOperaItalia,
			String segnaLibro, int valutazione, int numeroCapitoli, int numeroVolumi, int anno) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.casaEditrice = casaEditrice;
		this.categoria = categoria;
		this.tags = tags;
		this.stato = stato;
		this.srcImg = srcImg;
		this.trama = trama;
		this.disponibilita = disponibilita;
		this.statoOperaItalia = statoOperaItalia;
		this.segnaLibro = segnaLibro;
		this.valutazione = valutazione;
		this.numeroCapitoli = numeroCapitoli;
		this.numeroVolumi = numeroVolumi;
		this.anno = anno;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getCasaEditrice() {
		return casaEditrice;
	}

	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getSrcImg() {
		return srcImg;
	}

	public void setSrcImg(String srcImg) {
		this.srcImg = srcImg;
	}

	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	public String getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(String disponibilita) {
		this.disponibilita = disponibilita;
	}

	public String getStatoOperaItalia() {
		return statoOperaItalia;
	}

	public void setStatoOperaItalia(String statoOperaItalia) {
		this.statoOperaItalia = statoOperaItalia;
	}

	public String getSegnaLibro() {
		return segnaLibro;
	}

	public void setSegnaLibro(String segnaLibro) {
		this.segnaLibro = segnaLibro;
	}

	public int getValutazione() {
		return valutazione;
	}

	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}

	public int getNumeroCapitoli() {
		return numeroCapitoli;
	}

	public void setNumeroCapitoli(int numeroCapitoli) {
		this.numeroCapitoli = numeroCapitoli;
	}

	public int getNumeroVolumi() {
		return numeroVolumi;
	}

	public void setNumeroVolumi(int numeroVolumi) {
		this.numeroVolumi = numeroVolumi;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
}
