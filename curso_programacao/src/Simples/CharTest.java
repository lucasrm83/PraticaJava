package Simples;

public class CharTest {
    public static void main(String[] args) {
        char ch = '9';
        char ch1 = '1';
        String numbs = "123456789";
        int i = numbs.length()-1;
        System.out.println(i);
        int value = numbs.charAt(i--)-'0';
        System.out.println(i);
        System.out.println(value);
        //System.out.println(ch-'0'+ch1-'0');
        //converte char para int usando o valor ascii

    }
}
