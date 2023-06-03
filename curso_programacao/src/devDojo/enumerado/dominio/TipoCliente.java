package devDojo.enumerado.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private int VALOR;

    public int getVALOR() {
        return VALOR;
    }


    TipoCliente(int valor) {
        this.VALOR = valor;
    }
}
