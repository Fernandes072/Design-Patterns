package br.edu.ifs.designpatterns.iterator.impl;

public class Musica {
	
	private String nome;
	private String artista;

	public Musica(String nome, String artista) {
		this.nome = nome;
		this.artista = artista;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getArtista() {
		return artista;
	}
	
}
