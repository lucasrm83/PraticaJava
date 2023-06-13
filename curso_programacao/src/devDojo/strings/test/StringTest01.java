package devDojo.strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Lucas";
        String nome2 = "Lucas";
        nome = nome.concat(" Ribeiro");
        System.out.println(nome ==nome2);

    }
}
