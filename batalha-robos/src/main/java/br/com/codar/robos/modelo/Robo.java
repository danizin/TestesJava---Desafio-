package br.com.codar.robos.modelo;

import java.util.Objects;

import br.com.codar.robos.validador.robos.ExecutorValidacaoRobo;

public class Robo {

	private final int ataque;
	private final int defesa;
	private final Habilidade habilidade;

	
	public Robo(int ataque, int defesa, Habilidade habilidade) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.habilidade = habilidade;
		new ExecutorValidacaoRobo().validar(this);
	}

	public int getPoder() {
		return this.ataque + this.defesa + this.habilidade.getPoderAdicional();
	}

	public Habilidade getHabilidade() {
		return this.habilidade;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Robo robo = (Robo) o;
		return ataque == robo.ataque && defesa == robo.defesa && habilidade == robo.habilidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ataque, defesa, habilidade);
	}

	@Override
	public String toString() {
		return "Robo{" + "ataque=" + ataque + ", defesa=" + defesa + ", habilidade=" + habilidade + '}';
	}

}
