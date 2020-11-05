package br.com.codar.robos.validador.robos;

import java.util.List;

import br.com.codar.robos.modelo.Robo;

public class ExecutorValidacaoRobo {

    private final List<ValidadorRobo> validadores;

    public ExecutorValidacaoRobo() {
        validadores = List.of(new ValidadorHabilidade());
    }

    public void validar(Robo robo) {
        validadores.forEach(validador -> validador.validar(robo));
    }

}
