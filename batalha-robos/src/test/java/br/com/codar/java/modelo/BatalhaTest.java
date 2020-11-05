package br.com.codar.java.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import br.com.codar.robos.modelo.Batalha;
import br.com.codar.robos.modelo.Habilidade;
import br.com.codar.robos.modelo.Robo;
import br.com.codar.robos.notificador.NotificadorVencedor;
import br.com.codar.robos.validador.robos.builder.CriadorDeBatalha;

public class BatalhaTest {

	@Test
	public void testaBatalhaComAoMenosDoisRobos() {
		// parte 1: cenário
		Batalha batalha = new CriadorDeBatalha().para(new NotificadorVencedor())
				.adicionaRobo(70, 40, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(30, 70, Habilidade.ESCUDO_ENERGIA)
				.carregando();
		// parte2: ação
		batalha.realizar();
		// parte 3: validação
		assertEquals(2, batalha.getRobos().size());

	}

	@Test
	public void testaBatalhaComNoMaximoDezRobos() {
		Batalha batalha = new CriadorDeBatalha().para(new NotificadorVencedor())
				.adicionaRobo(10, 10, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(20, 20, Habilidade.ESCUDO_ENERGIA)
				.adicionaRobo(30, 30, Habilidade.ARMA_CHOQUE)
				.adicionaRobo(40, 40, Habilidade.ESCUDO_ENERGIA)
				.adicionaRobo(50, 50, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(60, 60, Habilidade.ARMA_CHOQUE)
				.adicionaRobo(70, 70, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(80, 80, Habilidade.ARMA_CHOQUE)
				.adicionaRobo(90, 90, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(90, 90, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(5, 5, Habilidade.ARMA_CHOQUE)
				.carregando();
		batalha.realizar();

		assertEquals(10, batalha.getRobos().size());
	}
	
	@Test
	public void verificarSeANotificacaoDoVencedorFoiEnviada() {
		NotificadorVencedor notificador = mock(NotificadorVencedor.class);
		Batalha batalha = new CriadorDeBatalha().para(notificador)
				.adicionaRobo(10, 10, Habilidade.LANCA_CHAMAS)
				.adicionaRobo(20, 20, Habilidade.ESCUDO_ENERGIA)
				.carregando();
		Robo vencedor = batalha.realizar();
		
		verify(notificador).notificarVencedor(vencedor);

	}
	
	@Test
	public void testeComAomenosDoisRobosComAHabilidadeSuperPoder() {
		Batalha batalha = new CriadorDeBatalha().para(new NotificadorVencedor())
				.adicionaRobo(10, 10, Habilidade.SUPER_PODER)
				.adicionaRobo(20, 20, Habilidade.SUPER_PODER)
				.adicionaRobo(30, 30, Habilidade.LANCA_CHAMAS)
				.carregando();
		Robo vencedor = batalha.realizar();
		
		Set<Robo> robos = batalha.getRobos();
		List<Robo> listaRobos = new ArrayList<>(robos);
		assertEquals(vencedor, listaRobos.get(1));

	}
	
	
}
