package br.edu.ifs.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.flyweight.impl.TipoBloco;

public class FabricaBlocos {
	
	private static List<TipoBloco> tipos = new ArrayList<>();
	
	public static TipoBloco obterTipo(String tipo, boolean quebravel, boolean inflamavel, boolean empilhavel) {
		TipoBloco novo = new TipoBloco(tipo, quebravel, inflamavel, empilhavel);
		int pos = tipos.indexOf(novo);
		if (pos == -1) {
			tipos.add(novo);
			return novo;
		}
		return tipos.get(pos);
	}
}
