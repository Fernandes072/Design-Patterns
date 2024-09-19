package br.edu.ifs.designpatterns.mediator;

public abstract class Colaborador {

	protected String id;
	protected Mediador mediador;

	public Colaborador(String id, Mediador mediador) {
		this.id = id;
		this.mediador = mediador;
		mediador.adicionarColaborador(this);
	}

	public String getId() {
		return id;
	}

	public Mediador getMediador() {
		return mediador;
	}

	@Override
	public String toString() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Colaborador && obj != null) {
			return id.equals(((Colaborador) obj).getId());
		}
		return false;
	}
}