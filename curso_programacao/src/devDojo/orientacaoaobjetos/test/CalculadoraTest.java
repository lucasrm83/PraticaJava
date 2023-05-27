package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora =new Calculadora();
        int salario = 2500;
        int bonus = 300;
        System.out.println(calculadora.soma(salario,bonus));
    }
}
