package br.edu.ifs.designpatterns.proxy.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import br.edu.ifs.designpatterns.proxy.Arquivo;

public class ArquivoReal implements Arquivo {

	private Path caminho;

	public ArquivoReal(String nome) {
		this.caminho = Paths.get(nome);
	}

	@Override
	public void criar() {
		try {
			Files.createFile(caminho);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void escrever(String texto) {
		try {
			Files.write(caminho, texto.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String recuperar() {
		try {
			return Files.readString(caminho);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public void remover() {
		try {
			Files.delete(caminho);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
