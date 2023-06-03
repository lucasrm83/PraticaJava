package devDojo.enumerado.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int VALOR;
    private String nomeRelatorio;


    public int getVALOR() {
        return VALOR;
    }


    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
}
