package br.com.codar.robos.excecoes;

public class RoboSemHabilidadeException extends RuntimeException {

    private static final String MENSAGEM = "Todo robô deve ter uma habilidade.";

    public RoboSemHabilidadeException() {
        super(MENSAGEM);
    }
}
