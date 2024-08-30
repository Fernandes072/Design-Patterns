package br.edu.ifs.designpatterns.adapter.impl;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifs.designpatterns.adapter.Repositorio;
import br.edu.ifs.designpatterns.adapter.RepositorioString;

public class AdaptadorString  implements Repositorio{
	
	private RepositorioString repositorioString;

	public AdaptadorString(RepositorioString repositorioString) {
		this.repositorioString = repositorioString;
	}
	
	@Override
	public Map<String, String> obterAlunos() {
		String[] alunosString = repositorioString.recuperarDados().split(";");
		Map<String, String> alunosMap = new HashMap<>();
		for (int i = 0; i < alunosString.length; i++) {
			String aluno = alunosString[i];
			alunosMap.put(aluno.split("	")[0], aluno.split("	")[1]);
		}
		return alunosMap;
	}

}
