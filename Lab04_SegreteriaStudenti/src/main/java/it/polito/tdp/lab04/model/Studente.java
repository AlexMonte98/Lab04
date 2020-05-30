package it.polito.tdp.lab04.model;

public class Studente {
	private long matricola;
	private String cognome;
	private String nome;
	private String cds;//CORSO DI INSEGNAMENTO
	
	public Studente(long matricola, String cognome, String nome, String cds) {
		super();
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
		this.cds = cds;
	}
	
	public long getMatricola() {
		return matricola;
	}
	public void setMatricola(long matricola) {
		this.matricola = matricola;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCds() {
		return cds;
	}
	public void setCds(String cds) {
		this.cds = cds;
	}
	
	

}
