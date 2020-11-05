package br.com.codar.robos.excecoes;

import java.text.MessageFormat;

public class RoboFaltanteException extends RuntimeException {

    private static final String MENSAGEM = "Estão faltando robôs para iniciar a batalha. Atualmente temos {0} robô(s). Precisamos de ao menos 2.";

    public RoboFaltanteException(int quantidade) {
        super(MessageFormat.format(MENSAGEM, quantidade));
    }
}
