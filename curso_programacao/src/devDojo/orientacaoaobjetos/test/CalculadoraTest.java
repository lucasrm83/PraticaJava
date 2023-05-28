package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora =new Calculadora();
        int salario = 2500;
        int bonus = 300;
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,4,5,6,7,8);
        System.out.println(calculadora.soma(salario,bonus));
    }
}
