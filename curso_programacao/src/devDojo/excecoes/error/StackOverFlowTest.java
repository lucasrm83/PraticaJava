package devDojo.excecoes.error;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
