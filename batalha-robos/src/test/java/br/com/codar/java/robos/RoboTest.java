package br.com.codar.java.robos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import br.com.codar.robos.excecoes.RoboSemHabilidadeException;
import br.com.codar.robos.modelo.Batalha;
import br.com.codar.robos.modelo.Habilidade;
import br.com.codar.robos.modelo.Robo;
import br.com.codar.robos.notificador.NotificadorVencedor;
import br.com.codar.robos.validador.robos.builder.CriadorDeBatalha;

public class RoboTest {

	@Test(expected = RoboSemHabilidadeException.class)
	public void testarRoboComPoderes() {
		Batalha batalha = new CriadorDeBatalha().para(new NotificadorVencedor())
				.adicionaRobo(10, 10, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(40, 20, null)
				.carregando();
		batalha.realizar();

	}

	@Test
	public void testaPoderDosRobos() {
		// parte 1: cenário

		Batalha batalha = new CriadorDeBatalha().para(new NotificadorVencedor())
				.adicionaRobo(70, 40, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(30, 70, Habilidade.ESCUDO_ENERGIA)
				.adicionaRobo(100, 70, Habilidade.ESCUDO_ENERGIA)
				.carregando();

		// parte2: ação

		batalha.realizar();

		// parte 3: validação
		int robo1 = 125;
		int robo2 = 110;
		int robo3 = 180;
		
		

		Set<Robo> robos = batalha.getRobos();
		List<Robo> listaRobos = new ArrayList<>(robos);
		assertEquals(3, batalha.getRobos().size());
		assertEquals(robo1, listaRobos.get(0).getPoder());
		assertEquals(robo2, listaRobos.get(1).getPoder());
		assertEquals(robo3, listaRobos.get(2).getPoder());
	}

	@Test
	public void testaRoboVencedor() {
		// parte 1: cenário

		Batalha batalha = new CriadorDeBatalha().para(new NotificadorVencedor())
				.adicionaRobo(70, 40, Habilidade.ESCUDO_ENERGIA)
				.adicionaRobo(30, 70, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(45, 70, Habilidade.LANCA_CHAMAS)
				.carregando();
		
		Robo vencedor = batalha.realizar();

		// parte 3: validação
		
		
		Set<Robo> robos = batalha.getRobos();
		List<Robo> listaRobos = new ArrayList<>(robos);
		assertEquals(vencedor, listaRobos.get(2));

	}

}
