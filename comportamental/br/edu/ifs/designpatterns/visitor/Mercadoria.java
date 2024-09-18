package br.edu.ifs.designpatterns.visitor;

public abstract class Mercadoria {
	
	private double custo;
	
	public Mercadoria(double custo) {
		this.custo = custo;
	}
	
	public double getCusto() {
		return custo;
	}

	public abstract Double aceitar(Taxador taxador);
}
