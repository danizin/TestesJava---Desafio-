package br.com.codar.robos.validador.batalha;

import java.util.Set;

import br.com.codar.robos.excecoes.RoboExcedenteException;
import br.com.codar.robos.modelo.Batalha;
import br.com.codar.robos.modelo.Robo;

public class ValidadorRoboExcedente implements ValidadorBatalha {

    private static final int NUMERO_MAXIMO_ROBOS = 10;

    public void validar(Batalha batalha) {
        Set<Robo> robos = batalha.getRobos();
        if (robos.size() > NUMERO_MAXIMO_ROBOS) {
            throw new RoboExcedenteException(robos.size());
        }
    }
}
