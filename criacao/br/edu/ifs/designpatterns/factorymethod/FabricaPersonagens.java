package br.edu.ifs.designpatterns.factorymethod;

import br.edu.ifs.designpatterns.factorymethod.impl.Anao;
import br.edu.ifs.designpatterns.factorymethod.impl.Elfo;
import br.edu.ifs.designpatterns.factorymethod.impl.Humano;
import br.edu.ifs.designpatterns.factorymethod.impl.Orc;

public class FabricaPersonagens {
	
	public static Personagem criarPersonagem(String personagem) {
		if (personagem == "orc") {
			return new Orc();
		} else if (personagem == "anão") {
			return new Anao();
		} else if (personagem == "elfo") {
			return new Elfo();
		} else if (personagem == "humano") {
			return new Humano();
		}
		throw new IllegalStateException("Personagem não encontrado!");
	}

}
