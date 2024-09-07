package br.edu.ifs.designpatterns.iterator.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.iterator.Agregador;
import br.edu.ifs.designpatterns.iterator.Iterador;

public class PlaylistArtistas implements Agregador<Musica> {

	private List<Musica> musicas;

	public PlaylistArtistas() {
		musicas = new ArrayList<>();
	}

	@Override
	public Iterador<Musica> criarIterador() {
		return new IteradorPlaylistArtistas(musicas);
	}

	public void adicionar(Musica musica) {
		musicas.add(musica);
	}

}
