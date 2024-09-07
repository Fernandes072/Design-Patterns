package br.edu.ifs.designpatterns.iterator.impl;

import java.util.List;

import br.edu.ifs.designpatterns.iterator.Iterador;

public class IteradorPlaylistMusicas implements Iterador<Musica> {
	
	private List<Musica> musicas;
	private int posicao;
	
	public IteradorPlaylistMusicas(List<Musica> musicas) {
		this.musicas = musicas;
		posicao = 0;
	}

	@Override
	public Musica proximo() {
		return musicas.get(posicao++);
	}

	@Override
	public boolean temProximo() {
		return posicao < musicas.size();
	}

}
