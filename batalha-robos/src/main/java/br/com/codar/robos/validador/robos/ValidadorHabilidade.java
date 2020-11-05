package br.com.codar.robos.validador.robos;

import br.com.codar.robos.excecoes.RoboSemHabilidadeException;
import br.com.codar.robos.modelo.Robo;

public class ValidadorHabilidade implements ValidadorRobo {

    @Override
    public void validar(Robo robo) {
        if (robo.getHabilidade() == null) {
            throw new RoboSemHabilidadeException();
        }
    }
}
