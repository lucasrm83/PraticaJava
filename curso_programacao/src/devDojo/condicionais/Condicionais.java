package devDojo.condicionais;

public class Condicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean autorizadoBeber = idade>=18;
        if (autorizadoBeber){
            System.out.println("É maior de idade");
        }
        else {
            System.out.println("É menor de idade");
        }
    }
}
