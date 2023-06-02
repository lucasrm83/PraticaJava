package devDojo.enumerado.test;

import devDojo.enumerado.dominio.Cliente;
import devDojo.enumerado.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("joao", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("marcos", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("henrique", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("antonio", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
