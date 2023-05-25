package devDojo.condicionais;

public class ExercicioIf {
    public static void main(String[] args) {
        double valorTotal = 80000;
        for (int i = 1; i < valorTotal; i++) {
            double valorParcela = valorTotal/i;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("parcela "+i+" R$ "+valorParcela);
            
        }
    }
}
