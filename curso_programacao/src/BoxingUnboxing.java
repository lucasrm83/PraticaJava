public class BoxingUnboxing {
    public static void main(String[] args) {

        /*Exemplo de boxing, atribuindo o valor de um tipo primitivo a um objeto compatível*/
        int valor = 20;
        Object obj = valor;
        System.out.println(obj);

        /*Exemplo de unboxing, atribuindo o valor de um tipo referência(object) para um tipo valor (primitivo*/
        int y = (int) obj;
        System.out.println(y);

        /*Usando com Wrapper classes*/
        int a = 30;
        Integer number = a;
        System.out.println(a);

        int b = number*3;
        System.out.println(b);





    }
}
