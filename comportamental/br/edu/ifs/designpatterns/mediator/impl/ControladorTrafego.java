package br.edu.ifs.designpatterns.mediator.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class ControladorTrafego implements Mediador {

	private List<Aeronave> aeronaves;
	private Metereologia metereologia;
	private Oficina oficina;
	private List<Aeronave> filaPouso;
	private List<Aeronave> filaDecolagem;

	public ControladorTrafego() {
		aeronaves = new ArrayList<>();
		filaPouso = new ArrayList<>();
		filaDecolagem = new ArrayList<>();
	}

	@Override
	public String notificao(String mensagem, Colaborador colaborador) {
		if (colaborador instanceof Aeronave) {
			if (metereologia.getCondicoesFavoraveis()) {
				if (mensagem.equals("Decolagem")) {
					if (oficina.getAeronaves().indexOf(colaborador) >= 0) {
						return colaborador.getId() + ": " + mensagem + " negada - manutenção.";
					} else {
						return colaborador.getId() + ": " + mensagem + " autorizada.";
					}
				} else if (mensagem.equals("Pouso")) {
					return colaborador.getId() + ": " + mensagem + " autorizado.";
				}
			} else {
				if (mensagem.equals("Decolagem")) {
					filaDecolagem.add((Aeronave) colaborador);
					return colaborador.getId() + ": " + mensagem + " negada - condições metereológicas.";
				} else if (mensagem.equals("Pouso")) {
					filaPouso.add((Aeronave) colaborador);
					return colaborador.getId() + ": " + mensagem + " negado - condições metereológicas.";
				}
			}
		} else if (colaborador instanceof Metereologia) {
			StringBuilder s = new StringBuilder();

			List<String> filaP = new ArrayList<String>();
			for (Aeronave aeronave : filaPouso) {
				filaP.add(aeronave.solicitarPouso());
			}

			List<String> filaD = new ArrayList<String>();
			for (Aeronave aeronave : filaDecolagem) {
				filaD.add(aeronave.solicitarDecolagem());
			}

			s.append(filaP);
			s.append("\n");
			s.append(filaD);
			return s.toString();
		}
		return null;
	}

	@Override
	public void adicionarColaborador(Colaborador colaborador) {
		if (colaborador instanceof Aeronave) {
			aeronaves.add((Aeronave) colaborador);
		} else if (colaborador instanceof Metereologia) {
			metereologia = (Metereologia) colaborador;
		} else if (colaborador instanceof Oficina) {
			oficina = (Oficina) colaborador;
		}
	}
}