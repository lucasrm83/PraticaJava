public class Exercicio_1 {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5299;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.00;
        double measure = 53.234567;

        System.out.printf("Products: \n %s which price is $ %.2f \n %s which price is $ %.2f \n Record: %d years old, code %d and gender: %c\n\n" +
                " Measure with eight decimals places: %.8f\n Rounded (three decimal places): %.3f\n US decimal point: %.3f", product1, price1, product2, price2,age,code,gender,measure,measure,measure);
    }

}
