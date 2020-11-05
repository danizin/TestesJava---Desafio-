package br.com.codar.robos.modelo;

public enum Habilidade {
    LANCA_CHAMAS(15),
    ARMA_CHOQUE(20),
    ESCUDO_ENERGIA(10),
	SUPER_PODER(100);	
	
    private final int poderAdicional;

    Habilidade(int poderAdicional) {
        this.poderAdicional = poderAdicional;
    }

    public int getPoderAdicional() {
        return poderAdicional;
    }
}
