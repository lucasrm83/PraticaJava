package devDojo.excecoes.runtime;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            System.out.println(divisao(1,0));

        }catch (java.lang.RuntimeException e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a,int b){
        if(b==0){
            throw new IllegalArgumentException("Argumento ilegal, divisão por zero!");
        }
        return a/b;

    }
}
