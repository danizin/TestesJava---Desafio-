package br.com.codar.robos.validador.batalha;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.codar.robos.excecoes.SuperPoderException;
import br.com.codar.robos.modelo.Batalha;
import br.com.codar.robos.modelo.Habilidade;
import br.com.codar.robos.modelo.Robo;

public class ValidadorSuperPoderUsadoPorDoisRobos implements ValidadorBatalha {

	@Override
	public void validar(Batalha batalha) {
		Set<Robo> robos = batalha.getRobos();
		List<Robo> listaRobos = robos.stream().collect(Collectors.toList());
		Long totalRobos = listaRobos.stream().filter(robo -> robo.getHabilidade() == Habilidade.SUPER_PODER).count();
		if (totalRobos == 1) {
			throw new SuperPoderException();

		}

	}

}
