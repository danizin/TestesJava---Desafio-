package br.com.codar.robos.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.codar.robos.excecoes.NenhumVencedorException;
import br.com.codar.robos.notificador.NotificadorVencedor;
import br.com.codar.robos.validador.batalha.ExecutorValidacaoBatalha;

public class Batalha {

    private final Set<Robo> robos = new LinkedHashSet<>();
    private final NotificadorVencedor notificador;

    public Batalha(NotificadorVencedor notificador) {
        this.notificador = notificador;
    }

    public void adicionarParticipantes(Robo ...robos) {
        this.robos.addAll(Arrays.asList(robos));
    }

    public Set<Robo> getRobos() {
        return Collections.unmodifiableSet(robos);
    }

    public Robo realizar() {
        new ExecutorValidacaoBatalha().validar(this);

        Robo vencedor = getRobos()
            .stream()
            .max(Comparator.comparing(Robo::getPoder))
            .orElseThrow(NenhumVencedorException::new);
        notificador.notificarVencedor(vencedor);
        return vencedor;
    }
}
