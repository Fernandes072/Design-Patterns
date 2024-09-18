package br.edu.ifs.designpatterns.visitor;

import br.edu.ifs.designpatterns.visitor.impl.Alimento;
import br.edu.ifs.designpatterns.visitor.impl.Cerveja;
import br.edu.ifs.designpatterns.visitor.impl.Cigarro;
import br.edu.ifs.designpatterns.visitor.impl.Vinho;

public interface Taxador {
	public double taxarAlimento(Alimento alimento);
	public double taxarCigarro(Cigarro cigarro);
	public double taxarCerveja(Cerveja cerveja);
	public double taxarVinho(Vinho vinho);
}
