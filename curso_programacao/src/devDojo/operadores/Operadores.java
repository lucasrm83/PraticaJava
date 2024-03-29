package devDojo.operadores;

public class Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero1 = 10;
        int numero2 = 20;
        //System.out.println(numero2+numero1+" é o resultado! "+numero1+numero2);
        //a partir do momento que o java detecta a concatenação de ints com strings, os proximos "+" irão concatenar
        // e não somar, então fique esperto
        double multiplicacao = numero1*numero2;
        double divisao = numero1/numero2;
        //Cuidado que divisão de inteiro com inteiro sempre vai resultar em um inteiro

        //Operadores relacionais
        int resto = 20%2;
        // pode ser usado para descobrir se o número e par ou impar, se a divisao de um par por par sempre vai dar par
        //impar por impar também.
        //System.out.println(resto);



        //< > <= >= == !=
        int num = 1;
        boolean isthislessthanzero = 1<0;
        //System.out.println(isthislessthanzero);

        // &&(and) || (or)
        int idade = 29;
        double salario = 3500;
        boolean isInLawGreaterThanThirty = idade <30 && salario <4612;
        boolean isInLawLesserThanThirty = idade >30 && salario <3381;
        //System.out.println(isInLawGreaterThanThirty);

        double contaCorrente = 200;
        double contaPoupança =10000;
        double playstationValue = 2500;

        boolean isPlaystationBuyable = contaCorrente>= playstationValue || contaPoupança>=playstationValue;
        //System.out.println(isPlaystationBuyable);

        //= += -= *= %=

        double bonus = 1800;
        bonus+=1000;
        bonus-=1000;
        bonus*=2;
        bonus/=2;
        bonus%=2;



    }
}
