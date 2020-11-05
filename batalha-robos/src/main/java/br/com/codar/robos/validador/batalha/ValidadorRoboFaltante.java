package br.com.codar.robos.validador.batalha;

import java.util.Set;

import br.com.codar.robos.excecoes.RoboFaltanteException;
import br.com.codar.robos.modelo.Batalha;
import br.com.codar.robos.modelo.Robo;

public class ValidadorRoboFaltante implements ValidadorBatalha {

    private static final int NUMERO_MINIMO_ROBOS = 2;

    public void validar(Batalha batalha) {
        Set<Robo> robos = batalha.getRobos();
        if (robos.size() < NUMERO_MINIMO_ROBOS) {
            throw new RoboFaltanteException(robos.size());
        }
    }
}
