package devDojo.condicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 5000;
        String doar = "posso doar";
        String nDoar = "não posso doar";
        String resultado = salario>6000 ? doar : nDoar;
        System.out.println(resultado);
    }
}
