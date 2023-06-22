package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Bmw",280);
        Carro carro2 = new Carro("Pagani",420);
        Carro.velocidadeLimite =200;
        System.out.println(Carro.velocidadeLimite);
        System.out.println(carro);
    }
}
