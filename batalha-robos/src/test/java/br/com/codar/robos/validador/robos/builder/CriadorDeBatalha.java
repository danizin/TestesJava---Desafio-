package br.com.codar.robos.validador.robos.builder;

import br.com.codar.robos.modelo.Batalha;
import br.com.codar.robos.modelo.Habilidade;
import br.com.codar.robos.modelo.Robo;
import br.com.codar.robos.notificador.NotificadorVencedor;

public class CriadorDeBatalha {
	
	private Batalha batalha;
	
	public CriadorDeBatalha para(NotificadorVencedor notificador) {
		this.batalha = new Batalha(notificador);
		return this;
	}
	
	public CriadorDeBatalha adicionaRobo(Integer ataque, Integer defesa, Habilidade habilidade) {
		batalha.adicionarParticipantes(new Robo(ataque, defesa, habilidade));
		return this;
	}
	
	public Batalha carregando() {
		return batalha;
	}
	
}
