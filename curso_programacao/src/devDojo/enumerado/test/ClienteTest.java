package devDojo.enumerado.test;

import devDojo.enumerado.dominio.Cliente;
import devDojo.enumerado.dominio.TipoCliente;
import devDojo.enumerado.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("joao", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("henrique", TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

    }
}
