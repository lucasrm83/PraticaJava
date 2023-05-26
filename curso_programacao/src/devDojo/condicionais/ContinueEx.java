package devDojo.condicionais;

public class ContinueEx {
    public static void main(String[] args) {
        double valorTotal = 80000;
        for (int i = (int)valorTotal; i >= 1; i--) {
            double valorParcela = valorTotal/i;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("parcela "+i+" R$ "+valorParcela);

        }
    }
}
