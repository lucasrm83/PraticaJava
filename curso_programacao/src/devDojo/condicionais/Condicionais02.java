package devDojo.condicionais;

public class Condicionais02 {
    public static void main(String[] args) {
        int idade =15;
        String categoria = "";
        if (idade <15){
            categoria = "categoria infantil";
        }
        else if (idade >= 15 && idade <18){
            categoria = "categoria juvenil";
        }
        else if (idade >= 18 && idade <21) {
            categoria = "categoria sub 20";

        }
        else {
            categoria = "categoria adulto";
        }
        System.out.println(categoria);
    }
}
