package br.edu.ifs.designpatterns.iterator.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.edu.ifs.designpatterns.iterator.Iterador;

public class IteradorPlaylistArtistas implements Iterador<Musica> {
	
	private List<Musica> musicas;
	private int posicao;
	
	public IteradorPlaylistArtistas(List<Musica> musicas) {
		this.musicas = musicas;
		Collections.sort(this.musicas, Comparator.comparing(Musica::getArtista));
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
