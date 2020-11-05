package br.com.codar.robos.excecoes;

public class SuperPoderException extends RuntimeException{

	private static final String MENSAGEM = "Seria injusto apenas um robô com super poderes. Devem existir ao menos 2 com essa habilidade.";

    public SuperPoderException() {
        super(MENSAGEM);
    }
}
	

