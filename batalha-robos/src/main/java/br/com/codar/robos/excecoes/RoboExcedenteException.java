package br.com.codar.robos.excecoes;

import java.text.MessageFormat;

public class RoboExcedenteException extends RuntimeException {

    private static final String MENSAGEM = "Temos robôs demais e não podemos iniciar a batalha. Atualmente temos {0} robôs. Devemos ter no máximo 10.";

    public RoboExcedenteException(int size) {
        super(MessageFormat.format(MENSAGEM, size));
    }
}
