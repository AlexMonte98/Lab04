package it.polito.tdp.lab04.model;

public class Corso {
	private String codins;
	private int numeroCrediti;
	private String nome;
	private int periodoDidattico;
	
	
	public Corso(String codins, int crediti, String nome, int pd) {
		super();
		this.codins = codins;
		this.numeroCrediti = crediti;
		this.nome = nome;
		this.periodoDidattico = pd;
	}
	
	
	public String getCodins() {
		return codins;
	}
	public void setCodins(String codins) {
		this.codins = codins;
	}
	public int getCrediti() {
		return numeroCrediti;
	}
	public void setCrediti(int crediti) {
		this.numeroCrediti = crediti;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPd() {
		return periodoDidattico;
	}
	public void setPd(int pd) {
		this.periodoDidattico = pd;
	}

}
