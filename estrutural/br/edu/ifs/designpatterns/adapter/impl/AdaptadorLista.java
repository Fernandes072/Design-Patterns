package br.edu.ifs.designpatterns.adapter.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifs.designpatterns.adapter.Repositorio;
import br.edu.ifs.designpatterns.adapter.RepositorioLista;

public class AdaptadorLista implements Repositorio{
	
	private RepositorioLista repositorioLista;

	public AdaptadorLista(RepositorioLista repositorioLista) {
		this.repositorioLista = repositorioLista;
	}

	@Override
	public Map<String, String> obterAlunos() {
		List<String> alunosList = repositorioLista.recuperarDados();
		Map<String, String> alunosMap = new HashMap<>();
		for (String aluno : alunosList) {
			alunosMap.put(aluno.split("	")[0], aluno.split("	")[1]);
		}
		return alunosMap;
	}

}
