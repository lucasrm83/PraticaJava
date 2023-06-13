package devDojo.strings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Lucas Ribeiro";
        nome.concat(" Yoru");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Lucas Ribeiro");
        sb.append(" Yoru").append(" Yamato");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
