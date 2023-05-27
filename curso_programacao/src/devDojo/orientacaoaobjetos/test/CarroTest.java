package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        carro.modelo = "b2";
        carro.nome = "Marrusia";
        carro.ano = 2011;
        carro1.modelo = "Gallardo";
        carro1.nome = "Lamborghini";
        carro1.ano = 2007;

        System.out.println("Carro 1: ");
        System.out.println(carro.modelo+" "+carro.nome+" "+carro.ano);
        System.out.println("Carro 2: ");
        System.out.println(carro1.modelo+" "+carro1.nome+" "+carro1.ano);
    }
}
