package br.edu.ifs.designpatterns.flyweight.impl;

public class TipoBloco {
	
	private String tipo;
	private boolean quebravel;
	private boolean inflamavel;
	private boolean empilhavel;
	
	public TipoBloco (String tipo, boolean quebravel, boolean inflamavel, boolean empilhavel) {
		this.tipo = tipo;
		this.quebravel = quebravel;
		this.inflamavel = inflamavel;
		this.empilhavel = empilhavel;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getQuebravel() {
		if (quebravel == true) {
			return "quebrável";
		}
		return "inquebrável";
	}
	
	public String getInflamavel() {
		if (inflamavel == true) {
			return "não inflamável";
		}
		return "inflamável";
	}
	
	public String getEmpilhavel() {
		if (empilhavel == true) {
			return "empilhável";
		}
		return "não empilhável";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TipoBloco && obj != null) {
			return tipo.equals(((TipoBloco) obj).getTipo());
		}
		return false;
	}

}
