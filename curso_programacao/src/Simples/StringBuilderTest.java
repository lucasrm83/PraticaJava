package Simples;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        for (int i = 10; i > 0; i--) {
            res.append(i);

        }

        System.out.println(res);
    }
}
