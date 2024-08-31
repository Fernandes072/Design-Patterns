package br.edu.ifs.designpatterns.command;

public class ControleRemoto {
	
	private Comando comando;
	
	public ControleRemoto() {
		
	}

	public void pressionarBotao() {
		if(comando == null) {
			throw new IllegalStateException("Comando não definido");
		}
		comando.executar();
	}

	public void definirComando(Comando comando) {
		this.comando = comando;
	}

}
