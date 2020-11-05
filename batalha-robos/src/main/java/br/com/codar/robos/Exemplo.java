package br.com.codar.robos;

import br.com.codar.robos.modelo.Batalha;
import br.com.codar.robos.modelo.Habilidade;
import br.com.codar.robos.modelo.Robo;
import br.com.codar.robos.notificador.NotificadorVencedor;

public class Exemplo {

    public static void main(String[] args) {
        NotificadorVencedor notificador = new NotificadorVencedor();
        Robo roboUm = new Robo(70, 40, Habilidade.LANCA_CHAMAS);
        Robo roboDois = new Robo(30, 70, Habilidade.ESCUDO_ENERGIA);
        Batalha batalha = new Batalha(notificador);
        batalha.adicionarParticipantes(roboUm, roboDois);
        Robo vencedor = batalha.realizar();
        System.out.println("O vencedor da batalha foi: " + vencedor);
    }
}
