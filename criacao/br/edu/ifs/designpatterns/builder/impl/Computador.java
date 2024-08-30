package br.edu.ifs.designpatterns.builder.impl;

public class Computador {
	
	private String processador;
	private int HD;
	private int RAM;
	
	public Computador(String processador, int HD, int RAM) {
		this.processador = processador;
		this.HD = HD;
		this.RAM = RAM;
	}

	public String getProcessador() {
		return processador;
	}

	public int getHD() {
		return HD;
	}

	public int getRAM() {
		return RAM;
	}

}
