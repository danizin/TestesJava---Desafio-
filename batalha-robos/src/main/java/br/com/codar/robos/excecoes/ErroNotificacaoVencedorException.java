package br.com.codar.robos.excecoes;

public class ErroNotificacaoVencedorException extends RuntimeException {

    private static final String MENSAGEM = "Não foi possível notificar o serviço externo do vencedor de batalha de robôs.";

    public ErroNotificacaoVencedorException() {
        super(MENSAGEM);
    }
}
