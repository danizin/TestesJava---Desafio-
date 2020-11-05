package br.com.codar.robos.validador.batalha;

import java.util.List;

import br.com.codar.robos.modelo.Batalha;

public class ExecutorValidacaoBatalha {

    private final List<ValidadorBatalha> validadores;

    public ExecutorValidacaoBatalha() {
        validadores = List.of(new ValidadorRoboExcedente(), new ValidadorRoboFaltante(),new ValidadorSuperPoderUsadoPorDoisRobos());
    }

    public void validar(Batalha batalha) {
        validadores.forEach(validador -> validador.validar(batalha));
    }
}
