package br.com.codar.robos.excecoes;

public class NenhumVencedorException extends RuntimeException {

    private static final String MENSAGEM = "Parece que nenhum robô sobreviveu ao combate. Não tivemos nenhum vencedor.";

    public NenhumVencedorException() {
        super(MENSAGEM);
    }
}
